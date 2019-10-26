package cn.wengzi.controller;

import cn.wengzi.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author wengzi
 * @date 2019/10/18 afternoon 18:29
 */
@RestController
@RequestMapping("/rest")
public class RestHandler {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/findAll")
    public List<Student> findAll() {
        return restTemplate.getForEntity("http://127.0.0.1:8010/student/findAll", List.class).getBody();
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") Long id) {
        return restTemplate.getForEntity("http://127.0.0.1:8010/student/findById/{id}", Student.class, id).getBody();
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student) {
        restTemplate.postForEntity("http://127.0.0.1:8010/student/save", student, null).getBody();
    }

    @PutMapping("/upd")
    public void upd(@RequestBody Student student) {
        restTemplate.put("http://127.0.0.1:8010/student/upd", student);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        restTemplate.delete("http://127.0.0.1:8010/student/deleteById/{id}", id);
    }
}
