/*
 * @Author      : daguan814
 * @date        : 2023/1/3 23:36
 * @Description :
 */


package org.shuijing.gushe_app.common.Generator;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;

public class Generator {
    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://121.40.85.197:3306/gushe", "gushe_shuijing", "gusheliying_1")
                .globalConfig(builder -> {
                    builder.author("shuijing") // 设置作者

                            .outputDir("/Users/shuijing/Documents/Code/Spring/gushe_app/src/main/java") // 指定输出目录,到java一层就可以了
                            .build();

                })
                .packageConfig(builder -> {
                    builder.parent("org.shuijing.gushe_app") // 设置父包名
                            .entity("pojo")
                            .mapper("dao");

                })
                .strategyConfig(builder -> {
                    builder.enableCapitalMode()

                            .entityBuilder().enableLombok()
                            .enableTableFieldAnnotation()
                            .versionColumnName("version")
                            .versionPropertyName("version")
                            .logicDeleteColumnName("deleted")
                            .logicDeletePropertyName("deleteFlag")

                            .controllerBuilder().enableRestStyle() //非常重要，用于restcontroller


                            .serviceBuilder()
                            .formatServiceFileName("%sService")
                            .formatServiceImplFileName("%sServiceImp")


                            .mapperBuilder().enableMapperAnnotation() //在dao上加mapper注解
                            .formatMapperFileName("%sDao")

                            .build();
                })

                .execute();


    }

}
