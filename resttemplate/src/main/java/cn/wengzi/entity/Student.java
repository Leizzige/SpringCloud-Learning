package cn.wengzi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author wengzi
 * @date 2019/10/18 晚上18:25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {
    private Long id;
    private String name;
    private Integer age;
}
