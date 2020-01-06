package cn.wengzi.config;

import feign.Feign;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author leizige
 * @date 2020/01/06 23：15
 * desc:关闭hystrix配置类
 */
@Configuration
public class DisableHystrixConfiguration {

    /**
     * 在FeignClient(configuration = DisableHystrixConfiguration.class)即可关闭Hystrix
     *
     * @return
     */
    @Bean
    @Scope("prototype")
    public Feign.Builder feignBuilder() {
        return Feign.builder();
    }
}
