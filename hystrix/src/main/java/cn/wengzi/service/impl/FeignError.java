package cn.wengzi.service.impl;

import cn.wengzi.entity.Student;
import cn.wengzi.service.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;


/**
 * @author wengzi
 * @date 2019/10/27 afternoon 14:10
 * @description Hystrix 熔断机制,定义容错处理逻辑
 */
@Component
public class FeignError implements FeignProviderClient {
    @Override
    public Collection<Student> findAll() {
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
        return "服务器维护中...";
    }
}
