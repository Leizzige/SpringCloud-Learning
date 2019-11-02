package cn.wengzi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author wengzi
 * @date 2019/11/2 afternoon 16:20
 * @description 读取Git远程仓库配置文件
 * @EnableConfigServer 开启 SpringCloud 服务端功能
 */
@SpringBootApplication
@EnableConfigServer
public class GitApplication {
    public static void main(String[] args) {
        SpringApplication.run(GitApplication.class, args);
    }
}
