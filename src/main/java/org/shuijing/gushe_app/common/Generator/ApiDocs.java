package org.shuijing.gushe_app.common.Generator;

import io.github.yedaxia.apidocs.Docs;
import io.github.yedaxia.apidocs.DocsConfig;

public class ApiDocs {
    public static void main(String[] args) {
        DocsConfig config = new DocsConfig();
        config.setProjectPath("/Users/shuijing/Documents/Code/Spring/gushe_app"); // 项目根目录
        config.setProjectName("古摄丽影"); // 项目名称
        config.setApiVersion("API文档");       // 声明该API的版本
        config.setDocsPath("/Users/shuijing/Documents/Code/Spring/gushe_app"); // 生成API 文档所在目录
        config.setAutoGenerate(Boolean.TRUE);  // 配置自动生成
        Docs.buildHtmlDocs(config); // 执行生成文档
    }
}