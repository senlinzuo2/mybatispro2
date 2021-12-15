package cn.nfu.server;

import cn.nfu.pojo.*;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @Auto
 */
public interface Myselect {

    public ArrayList<User> getUsers(String name);//做数据表的查询，---sql语句-select * from user

    void myinsert(User user);

/*   @Select("select * from user where name=#{0} and pass=#{1}")
    ArrayList<User> myshow(String name, String pass);*/
/*
    @Select("select * from user where name=#{n1} and pass=#{p1}")
    ArrayList<User> myshow(@Param("n1") String name, @Param("p1") String pass);*/

    @Select("select * from user where name=#{name} and pass=#{pass}")
    ArrayList<User> myshow(User user);


    int myInsert(HashMap map);

    /*HashMap<String,Object> selectMap(int id);*/

    @MapKey("name")
    HashMap<Integer, User> selectMaps();


    //resultType
    //select
    User1 selectUser1(int id);

    User1 selectUsermap(int id);

    Student selectStudent(int id);

    Student selectStudent1(int id);

    Dept deptbydid(int did);

    //获取部门的所有学生（对象）
    Dept1 getDeptStudent(int did);

    Dept1 deptbydid1(int did);

    Student1 studentById(int did);


    ArrayList<User> getUser();


    ArrayList<User> getDyUser(@Param("name1") String name,@Param("pass1") String pass);


}




