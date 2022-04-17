import Mapper.TestMapper;
import MybatisUtil.MybatisUtil;
import entity.Student;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        try (SqlSession session = MybatisUtil.getSession(true)) {
            /*使用封装工具类*/
            TestMapper mapper = session.getMapper(TestMapper.class);
            // mapper.selectStudents().forEach(System.out::println);
            //System.out.println(mapper.getStudentid(1));
            //System.out.println(mapper.addStudent(new Student().setSname("小王").setSex("2")));
            //System.out.println(mapper.deleteStudent(3));
            //System.out.println(mapper.getTeacherByID(1));
            //mapper.selectTeacherStudent(1).forEach(System.out::println);
            System.out.println(mapper.getStudentid(1));
        }
    }
}

