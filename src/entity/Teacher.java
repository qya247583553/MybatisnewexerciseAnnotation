package entity;

import lombok.Data;

import java.util.List;

@Data
public class Teacher {
    int tid;
    String tname;
    //List<Student> studentList;（需要写，不需要不写）
}
