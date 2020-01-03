package cn.wengzi.controller;

import cn.wengzi.entity.Student;
import cn.wengzi.service.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wengzi
 * @date 2019/10/18 afternoon 18:15
 */
@RestController
@RequestMapping("/student")
@SuppressWarnings("unchecked")
public class StudentHandler {

    @Autowired
    private StudentRepository studentRepository;

    @Value("${server.port}")
    private String port;


    @GetMapping("/findAll")
    public List<Student> findAll() {
        List<Student> list = new ArrayList<Student>(studentRepository.findAll());
        return list;
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") Long id) {
        return studentRepository.findById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student) {
        studentRepository.save(student);
    }

    @PutMapping("/upd")
    public void upd(@RequestBody Student student) {
        studentRepository.upd(student);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        studentRepository.deleteById(id);
    }

    @GetMapping("/getPort")
    public String getPort() {
        return "当前端口:" + port;
    }
}
