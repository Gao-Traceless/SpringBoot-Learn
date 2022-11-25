package com.gao.springboot.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 将配置文件中配置的每一个属性的值，映射到这个组件中
 * @ConfigurationProperties: 告诉SpringBoot将本类中的所有属性和配置文件中相关的配置进行绑定
 *      prefix = "person": 配置文件中哪个下面的所有属性进行一一映射(默认从全局配置文件获取值)
 * 只有这个组件是容器中的组件，才能使用容器提供的@ConfigurationProperties功能
 *  @Value 和@ConfigurationProperties比较:
 *  ConfigurationProperties: 支持批量注入配置文件中的数学，支持松散绑定(松散语法)还支持JSR303数据校验(类上加@Validated),支持复杂类型封装(map)
 *  Value: 只能一个个指定，支持SpELl
 *  但是无论是yml还是properties他们都能获取到值
 *
 * 如果说，我们只是在某个业务逻辑中需要获取一下配置文件中的某项值，使用@Value；
 * 如果说，我们专门编写了一个javaBean来和配置文件进行映射，我们就直接使用@ConfigurationProperties；
 *  @PropertySource&@ImportResource
 *      @PropertySource: 加载指定的配置文件
 *      @ImportResource: 导入Spring的配置文件，让配置文件里面的内容生效(@ImportResource(locations = {"classpath:beans.xml"}) 导入Spring的配置文件让其生效)
 *
 */
@Component
@ConfigurationProperties(prefix = "person")
//@PropertySource(value = {"classpath:person.properties"})
//@Validated
public class Person {

//    @Value("${person.last-name}")
//    @Email //lastName必须是邮箱格式
    private String lastName;

    private Integer age;

    private Boolean boss;

    private Date birth;

    private Map<String, Object> maps;

    private List<Object> list;

    private Dog dog;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getBoss() {
        return boss;
    }

    public void setBoss(Boolean boss) {
        this.boss = boss;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", birth=" + birth +
                ", maps=" + maps +
                ", list=" + list +
                ", dog=" + dog +
                '}';
    }
}
