package com.gao.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 *  SpringBoot启动会加载大量的自动配置类
 *  我们看我们需要的功能有没有SpringBoot默认写好的自动配置类；
 *  我们再来看这个自动配置类中到底配置了哪些组件；（只要我们要用的组件有，我们就不需要再来配置了）
 *  给容器中自动配置类添加组件的时候，会从properties类中获取某些属性。我们就可以在配置文件中指定这些属性的值；
 *  xxxxAutoConfigurartion：自动配置类；
 *  给容器中添加组件
 *  xxxxProperties:封装配置文件中相关属性；
 *
 *  @Conditional派生注解: 作用：必须是@Conditional指定的条件成立，才给容器中添加组件，配置配里面的所有内容才生效；
 *  我们怎么知道哪些自动配置类生效；
 *   我们可以通过启用 debug=true属性；来让控制台打印自动配置报告，这样我们就可以很方便的知道哪些自动配置类生效
 *
 *
 */
@SpringBootApplication
public class SpringBootConfigAutoconfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootConfigAutoconfigApplication.class, args);
    }

}
