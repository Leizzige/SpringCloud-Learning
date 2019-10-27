package cn.wengzi.repository.impl;

import cn.wengzi.pojo.Student;
import cn.wengzi.repository.FeignProviderClient;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @author wengzi
 * @date 2019/10/27 afternoon 14:18
 * @description Hystrix 熔断机制,定义容错处理逻辑
 */
@Component
public class ErrorFallbackFactory implements FallbackFactory<FeignProviderClient> {

    private static final Logger LOGGER = LoggerFactory.getLogger(ErrorFallbackFactory.class);

    @Override
    public FeignProviderClient create(Throwable throwable) {
        return new FeignProviderClient() {
            @Override
            public Collection<Student> findAll() {
                ErrorFallbackFactory.LOGGER.info("fall back cause:", throwable);
                return null;
            }

            @Override
            public Student findById(Long id) {
                return null;
            }

            @Override
            public void save(Student student) {

            }

            @Override
            public void upd(Student student) {

            }

            @Override
            public void deleteById(Long id) {

            }

            @Override
            public String getPort() {
                ErrorFallbackFactory.LOGGER.info("fall back cause:", throwable);
                return "服务器维护中....";
            }
        };
    }
}
