package cn.wengzi.service.impl;

import cn.wengzi.entity.Student;
import cn.wengzi.service.StudentRepository;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wengzi
 * @date 2019/10/18 afternoon 18:11
 */
@Component
public class StudentRepositoryImpl implements StudentRepository {

    private static Map<Object, Student> dbStudentMap = null;

    static {
        dbStudentMap = Collections.synchronizedMap(new HashMap<>());
        dbStudentMap.put(1L, new Student(1L, "张三", 23));
        dbStudentMap.put(2L, new Student(2L, "李四", 24));
        dbStudentMap.put(3L, new Student(3L, "王五", 25));
    }

    @Override
    public Collection findAll() {
        return dbStudentMap.values();
    }

    @Override
    public Student findById(Long id) {
        return dbStudentMap.get(id);
    }

    @Override
    public void save(Student student) {
        dbStudentMap.put(student.getId(), student);
    }

    @Override
    public void upd(Student student) {
        dbStudentMap.put(student.getId(), student);
    }

    @Override
    public void deleteById(Long id) {
        dbStudentMap.remove(id);
    }
}
