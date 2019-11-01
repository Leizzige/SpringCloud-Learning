package cn.wegnzi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author wengzi
 * @date 2019/11/1 night 23:14
 * @description SpringCloud 本地配置中心
 * @EnableConfigServer 声明配置中心
 */
@SpringBootApplication
@EnableConfigServer
public class NativeApplication {
    public static void main(String[] args) {
        SpringApplication.run(NativeApplication.class, args);
    }
}
