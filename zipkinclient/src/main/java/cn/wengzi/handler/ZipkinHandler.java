package cn.wengzi.handler;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/zipkin")
public class ZipkinHandler {

    @Value("${server.port}")
    private String port;


    @GetMapping(value = "/getPort", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String getPort() {
        return this.port;
    }
}
