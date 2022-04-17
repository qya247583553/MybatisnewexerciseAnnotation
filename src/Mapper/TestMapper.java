package Mapper;

import entity.Student;

import java.util.List;

public interface TestMapper {
   List<Student> selectStudents();//查询所有
   Student getStudentid(int studentid);//查询单个数据

   int addStudent(Student student);

   int deleteStudent(int studentid);
}
