package com.zs.webservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 使用SpringBootApplication注解，让我们不需要单独的将项目部署到web容器中去，因为spring内嵌了tomcat容器
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
