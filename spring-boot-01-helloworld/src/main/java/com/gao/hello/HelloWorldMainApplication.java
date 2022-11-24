package com.gao.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication: Spring Boot应用标注在某个类上说明这个类是SpringBoot的主配置类，SpringBoot就应该运行这个类的main方法来启动SpringBoot应用；
 *  组合注解:
 *      @SpringBootConfiguration: Spring Boot的配置类；
 *                  标注在某个类上，表示这是一个Spring Boot的配置类；
 *                  @Configuration:配置类上来标注这个注解；
 *                      配置类 ----- 配置文件；配置类也是容器中的一个组件；@Component
 *      @EnableAutoConfiguration:开启自动配置功能；以前我们需要配置的东西，Spring Boot帮我们自动配置；@EnableAutoConfiguration告诉SpringBoot开启自动配置功能；这样自动配置才能生效；
 *                  @AutoConfigurationPackage:自动配置包
 *                  @Import(AutoConfigurationPackages.Registrar.class): Spring的底层注解@Import，给容器中导入一个组件；导入的组件由AutoConfigurationPackages.Registrar.class来指定
 *                                                                      将主配置类（@SpringBootApplication标注的类）的所在包及下面所有子包里面的所有组件扫描到Spring容器；
 *                  @Import(EnableAutoConfigurationImportSelector.class): 给容器中导入组件    EnableAutoConfigurationImportSelector：导入哪些组件的选择器
 *                             将所有需要导入的组件以全类名的方式返回；这些组件就会被添加到容器中;会给容器中导入非常多的自动配置类（xxxAutoConfiguration）；就是给容器中导入这个场景需要的所有组件，并配置好这些组件
 *                             Spring Boot在启动的时候从类路径下的META-INF/spring.factories中获取EnableAutoConfiguration指定的值，将这些值作为自动配置类导入到容器中，自动配置类就生效，帮我们进行自动配置工作
 */
@SpringBootApplication
public class HelloWorldMainApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldMainApplication.class, args);
    }

}
