// 声明当前类所属的包，用于组织项目中的 Java 类。
package com.blizx;

// 导入 Lombok 的日志注解，自动生成名为 log 的日志对象。
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 为当前类生成日志对象，供启动过程记录信息。
@Slf4j
// 标记这是 Spring Boot 应用主配置类，启用组件扫描和自动配置。
@SpringBootApplication
// 定义瑞吉外卖应用的启动类。
public class ReggieApplication {
  public static void main(String[] args) {
    // 启动 Spring Boot 应用，并将命令行参数传递给应用上下文。
    SpringApplication.run(ReggieApplication.class, args);
    // 记录应用启动成功的信息。
    log.info("项目启动成功");
  }
}
