package cn.nfu.pojo;

import java.util.List;

/**
 * @Auto
 */
public class Dept1 {
    private int did;//部门id
    private String dname;

    private List<Student1> liststus;

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public List<Student1> getListstus() {
        return liststus;
    }

    public void setListstus(List<Student1> liststus) {
        this.liststus = liststus;
    }
}
