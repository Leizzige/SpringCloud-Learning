package cn.wengzi.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wengzi
 * @date 2019/11/1 night 23:40
 */
@RestController
@RequestMapping("readnative")
public class ReadNativeHandler {

    @Value("${server.port}")
    private String port;

    @Value("${foo}")
    private String foo;

    @GetMapping("/getPort")
    public String getPort() {
        return "端口:" + port + "  " + "版本号:" + foo;
    }
}
