package cn.test;

import cn.nfu.pojo.*;
import cn.nfu.server.Myselect;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Auto
 */
public class ReadUser {

    public static void main(String[] args) throws IOException {
        // XML 构建 SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        User user=null;
        // SqlSessionFactory 中获取 SqlSession
        
       SqlSession session = sqlSessionFactory.openSession(true);

       //数据的插入
        Myselect myselect = session.getMapper(Myselect.class);

    /*    HashMap<String,Object> map = new HashMap<String,Object>();
        map.put("nn1","root");
        map.put("pp1","123456");
        myselect.myInsert(map);*/


        //resultType
        //第一种情况：map(一行数据)
       // HashMap<String,Object> row = myselect.selectMap(1);
        //System.out.println(row);

        //第二种情况：map(多行数据)
         //HashMap<Integer,User> maps = myselect.selectMaps();
         //for (Map.Entry<Integer,User> entry : maps.entrySet()){
                //System.out.println(entry.getKey()+"="+entry.getValue().getName());
         //}

         //第三种情况list<User>

        //resultType
    /*    User1 user1 = myselect.selectUsermap(1);
        System.out.println(user1.getUserid()+"-"+user1.getUsername());*/

/*        Student student = myselect.selectStudent1(3);
       // System.out.println(student.getId()+"-"+student.getName()+"部门:"+student.getDept().getDname());

        System.out.println(student.getId()+"-"+student.getName());*/
     /*   Dept1 deptStudent = myselect.getDeptStudent(2);
        System.out.println(deptStudent.getDid()+"-"+deptStudent.getDname()+":");

        List<Student1> liststus = deptStudent.getListstus();
        System.out.println(liststus.size());
        for (Student1 stu : liststus){
            System.out.println(stu.getSid()+"-"+stu.getSname());
        }*/


     /*   Dept1 deptStudent = myselect.deptbydid1(1);
        System.out.println(deptStudent.getDid()+"-"+deptStudent.getDname()+":");

        List<Student1> liststus = deptStudent.getListstus();
        //System.out.println(liststus.size());
        for (Student1 stu : liststus){
            System.out.println(stu.getSid()+"-"+stu.getSname());
        }*/

   /*     ArrayList<User> myUser = myselect.getMyUser();
        for (User stu : myUser){
            System.out.println(stu.getId()+"-"+stu.getName()+"-"+stu.getPass());
        }*/

 /*       ArrayList<User> myUser = myselect.getDyUser(null,"123");
        for (User stu : myUser){
            System.out.println(stu.getId()+"-"+stu.getName()+"-"+stu.getPass());
        }  for (User stu : myUser){
            System.out.println(stu.getId()+"-"+stu.getName()+"-"+stu.getPass());
        }
*/
        ArrayList<User> user1 = myselect.getDyUser("admin",null);
        for (User stu : user1){
            System.out.println(stu.getId()+"-"+stu.getName()+"-"+stu.getPass());
        }

        session.close();

    }
    
    

}
