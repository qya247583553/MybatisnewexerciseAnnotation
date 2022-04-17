package Mapper;

import entity.Student;
import entity.Teacher;

import java.util.List;

public interface TestMapper {
   List<Student> selectStudents();//查询所有

   Student getStudentid(int studentid);//查询单个数据

   int addStudent(Student student);

   int deleteStudent(int studentid);

   Teacher getTeacherByID(int tid);

   List<Student> selectTeacherStudent(int tid);//查询一个老师的所有学生


}
