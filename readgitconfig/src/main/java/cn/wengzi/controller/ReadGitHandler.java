package cn.wengzi.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wengzi
 * @date 2019/11/3 night 23:20
 */
@RestController
@RequestMapping("/readGit")
public class ReadGitHandler {

    @Value("${server.port}")
    private String port;

    @Value("${spring.application.name}")
    private String name;


    @GetMapping("/info")
    public String getInfo() {
        return "端口号:" + this.port + "    " + "服务名:" + this.name;
    }
}
