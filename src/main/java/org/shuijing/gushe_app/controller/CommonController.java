/*
 * @Author      : daguan814
 * @date        : 2022/9/20 21:16
 * @Description :
 */


package org.shuijing.gushe_app.controller;


import lombok.extern.slf4j.Slf4j;

import org.shuijing.gushe_app.common.Result;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.UUID;


/**
 * 通用，文件上传下载
 */
@RestController
@RequestMapping("/common")
@Slf4j
public class CommonController {

    @Value("${shuijing.path}")
    private String basepath;

    /**
     * 文件上传
     *
     * @param file
     * @return
     */

    @PostMapping("/upload")
    public Result<String> upload(MultipartFile file) throws IOException {  //参数名必须和前端的name保持一致

        //原始文件名
        String originalFilename = file.getOriginalFilename();
        //不需要重命名，前端已经使用UUID
//        String suffix = originalFilename.substring(originalFilename.lastIndexOf("."));
//        //使用UUID重新生成文件名，避免文件重复造成文件覆盖 suffix:后缀名
//        String newfilename = UUID.randomUUID().toString() + suffix;

        File uploadFileSaveDir = new File(basepath);
        System.out.println("上传文件的存放目录："+uploadFileSaveDir.getAbsolutePath());
        if(!uploadFileSaveDir.exists()){
            // 递归生成文件夹
            uploadFileSaveDir.mkdirs();
        }


        //file 是一个临时文件，需要把它转存在指定位置,否则本次请求结束之后这个临时文件会消失
        file.transferTo(new File(basepath + originalFilename));


        return Result.success(originalFilename);
    }


    @GetMapping("/download")
    public void download(String name, HttpServletResponse response) throws IOException {

        //通过输入流读取文件内容
        FileInputStream fileInputStream = new FileInputStream(new File(basepath + name));

        //输出流，将文件写回浏览器，在浏览器里面展示图片
        ServletOutputStream outputStream = response.getOutputStream();

        int len= 0;
        byte[] bytes = new byte[1024];
        while ((len = fileInputStream.read(bytes)) != -1) {
            outputStream.write(bytes, 0, len);
            outputStream.flush();
        }

        outputStream.close();
        fileInputStream.close();


    }
}