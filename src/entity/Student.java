package entity;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Student {

//    protected Student(int xxx,String sname,String sex){
//        System.out.println("构造方法 222:" +xxx+","+sname+","+sex);
//    }

    int studentid;
    String  sname;
    String    sex;
}
