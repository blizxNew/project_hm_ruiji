package com.blizx.reggie.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

// 使用 Lombok 提供的日志注解，可以直接使用 log 对象记录日志
@Slf4j

// 将当前类声明为 Spring 配置类，交给 Spring 容器管理
@Configuration

// 继承 WebMvcConfigurationSupport，用于扩展 Spring MVC 的相关配置
public class WebMvcConfig extends WebMvcConfigurationSupport {

  /**
   * 设置静态资源映射
   */

  // 重写父类的静态资源处理器配置方法
  // ResourceHandlerRegistry 用于注册静态资源处理规则
  @Override
  protected void addResourceHandlers(ResourceHandlerRegistry registry) {

    // 设置后台管理系统的静态资源访问路径
    // 浏览器访问 /backend/** 时，映射到项目 resources/backend/ 目录下
    registry.addResourceHandler("/backend/**").addResourceLocations("classpath:/backend/");

    // 设置前台用户系统的静态资源访问路径
    // 浏览器访问 /front/** 时，映射到项目 resources/front/ 目录下
    registry.addResourceHandler("/front/**").addResourceLocations("classpath:/front/");

    log.info("静态资源启动成功");
  }
}
