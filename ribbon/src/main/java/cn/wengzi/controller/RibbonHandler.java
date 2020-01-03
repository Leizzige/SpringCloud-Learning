package cn.wengzi.controller;

import cn.wengzi.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author wengzi
 * @date 2019/10/26 night 23:47
 */
@RestController
@RequestMapping("/ribbon")
@SuppressWarnings("unchecked")
public class RibbonHandler {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/findAll")
    public List<Student> findAll() {
        return restTemplate.getForEntity("http://server-provider/student/findAll", List.class).getBody();
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") Long id) {
        return restTemplate.getForEntity("http://server-provider/student/findById/{id}", Student.class, id).getBody();
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student) {
        restTemplate.postForEntity("http://server-provider/student/save", student, null).getBody();
    }

    @PutMapping("/upd")
    public void upd(@RequestBody Student student) {
        restTemplate.put("http://server-provider/student/upd", student);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        restTemplate.delete("http://server-provider/student/deleteById/{id}", id);
    }

    @GetMapping("/getPort")
    public String getPort() {
        return restTemplate.getForObject("http://server-provider/student/getPort", String.class);
    }
}
