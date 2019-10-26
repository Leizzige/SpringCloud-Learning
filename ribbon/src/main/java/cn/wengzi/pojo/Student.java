package cn.wengzi.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author wengzi
 * @date 2019/10/26 night 23:46
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
