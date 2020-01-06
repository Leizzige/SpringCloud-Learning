package cn.wengzi.logger;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author leizige
 * desc:Feign 日志配置
 */
@Configuration
public class InfoFeignLogger {
    @Bean
    Logger.Level feignLoggerLevel() {
        //这里记录所有，根据实际情况选择合适的日志level
        return Logger.Level.FULL;
    }

    /*
    Feign logger 级别
    NONE: 不记录任何信息
    BASIC:仅记录请求方法、URL 及响应状态码和执行时间
    HEADERS:除了记录BASIC级别的信息之外,还会记录请求和响应的头信息
    FULL:记录所有请求与相应的明细,包括头信息、请求体、元数据等
     */
}
