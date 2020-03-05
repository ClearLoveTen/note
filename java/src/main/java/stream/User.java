package stream;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private Long id;       //主键id
    private String name;   //姓名
    private Integer age;   //年龄
    private String school; //学校
}