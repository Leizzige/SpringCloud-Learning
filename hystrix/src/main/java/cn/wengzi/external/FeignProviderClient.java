package cn.wengzi.external;

import cn.wengzi.pojo.Student;
import cn.wengzi.external.fallback.ErrorFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @author wengzi
 * @date 2019/10/27 noon 12:05
 * @description 声明式接口, Feign 声明式服务调用
 * 如果需要回退方法打印错误信息，可以使用fallbackFactory(fallback和fallbackFactory只能使用其中一种)
 */
@FeignClient(value = "server-provider", fallbackFactory = ErrorFallbackFactory.class)
public interface FeignProviderClient {

    @GetMapping("/student/findAll")
    public Collection<Student> findAll();

    @GetMapping("/student/findById/{id}")
    Student findById(@PathVariable("id") Long id);

    @PostMapping("/student/save")
    void save(@RequestBody(required = true) Student student);

    @PutMapping("/student/upd")
    void upd(@RequestBody(required = true) Student student);

    @DeleteMapping("/student/deleteById/{id}")
    void deleteById(@PathVariable("id") Long id);

    @GetMapping("/student/getPort")
    String getPort();
}
