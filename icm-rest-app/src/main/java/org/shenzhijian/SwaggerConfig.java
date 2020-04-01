package org.shenzhijian;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
@Import(BeanValidatorPluginsConfiguration.class)
public class SwaggerConfig {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("基础模块")
                .select()
                .apis(RequestHandlerSelectors.basePackage("org.shenzhijian.controller.base"))
                .paths(PathSelectors.any())
                .build();
    }

    @Bean
    public Docket assetRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("资产模块")
                .select()
                .apis(RequestHandlerSelectors.basePackage("org.shenzhijian.controller.asset"))
                .paths(PathSelectors.any())
                .build();
    }

    @Bean
    public Docket budgetRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("预算模块")
                .select()
                .apis(RequestHandlerSelectors.basePackage("org.shenzhijian.controller.budget"))
                .paths(PathSelectors.any())
                .build();
    }

    @Bean
    public Docket contractRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("合同模块")
                .select()
                .apis(RequestHandlerSelectors.basePackage("org.shenzhijian.controller.contract"))
                .paths(PathSelectors.any())
                .build();
    }

    @Bean
    public Docket paymentRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("支出模块")
                .select()
                .apis(RequestHandlerSelectors.basePackage("org.shenzhijian.controller.payment"))
                .paths(PathSelectors.any())
                .build();
    }


    @Bean
    public Docket projectRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("项目模块")
                .select()
                .apis(RequestHandlerSelectors.basePackage("org.shenzhijian.controller.project"))
                .paths(PathSelectors.any())
                .build();
    }

    @Bean
    public Docket purchaseRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("采购模块")
                .select()
                .apis(RequestHandlerSelectors.basePackage("org.shenzhijian.controller.purchase"))
                .paths(PathSelectors.any())
                .build();
    }


    //配置在线文档的基本信息
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("springboot利用swagger构建api文档")
                .description("简单优雅的restfun风格，https://me.csdn.net/blog/miachen520")
                .termsOfServiceUrl("https://me.www.net/blog/wwww")
                .version("1.0")
                .build();

    }
}
