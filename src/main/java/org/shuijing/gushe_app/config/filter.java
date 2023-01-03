package org.shuijing.gushe_app.config;
/**
 * @ClassName: LoginCheckFilter
 * @Description: TODO
 * @author: 达观
 * @date: 2022/7/24  14:05
 */

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;


import org.shuijing.gushe_app.common.Result;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static org.shuijing.gushe_app.common.JwtUtils.checkToken;


/**
 * 过滤器
 */


@WebFilter(filterName = "CommonFilter", urlPatterns = "/*")
@Slf4j
@Component
public class filter implements Filter {

    public static final AntPathMatcher PATH_MATCHER = new AntPathMatcher();//路径匹配器
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        //获取本此请求的uri
        String requestURI = request.getRequestURI();


        String[] urls = new String[]{ //不需要处理的请求
                "/codeUser/login",

        };

        //判断本次请求是否需要处理
        boolean check = check(urls,requestURI);
        if (check){     //不需要处理，直接放行
            System.out.println("本次不需要处理，放行");
            filterChain.doFilter(request,response);    //放行
            return;
        }



        //判断用户token是否合法
        String  token = request.getHeader("token");
        if(token == null || token.equals(" ")){
            //token为空，不能放行
            response.getWriter().write(JSON.toJSONString(Result.error(300,"token is null, Must Login")));
        }else if(!checkToken(token)) {  //token不正确，日期？攻击
            response.getWriter().write(JSON.toJSONString(Result.error(300,"token can not use")));
        }else {
//            token不为空，且日期正确，放行
            filterChain.doFilter(request,response);    //放行
        }


    }

    /**
     * 路径匹配
     * @param urls
     * @param requestURI
     * @return
     */

    public boolean check(String[] urls,String requestURI){

        for (String url : urls) {
            boolean match = PATH_MATCHER.match(url,requestURI);  //比较两个路径
            if (match) {
                return true;
            }
        }
        return false;
    }

}
