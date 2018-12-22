package com.itheima.domain;

/**
 * @Author: MR.z
 * @Date: 2018/12/2 18:17
 * @Version 1.0
 */
public class Dept {
    private int did;
    private String dname;

    public Dept() {
    }

    public Dept(int did, String dname) {
        this.did = did;
        this.dname = dname;
    }

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

    @Override
    public String toString() {
        return "Dept{" +
                "did=" + did +
                ", dname='" + dname + '\'' +
                '}';
    }
}
