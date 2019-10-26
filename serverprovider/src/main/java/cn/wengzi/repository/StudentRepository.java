package cn.wengzi.repository;

import cn.wengzi.entity.Student;

import java.util.Collection;

/**
 * @author wengzi
 * @date 2019/10/18 afternoon 18:18
 */
public interface StudentRepository {
    Collection findAll();

    Student findById(Long id);

    void save(Student student);

    void upd(Student student);

    void deleteById(Long id);
}
