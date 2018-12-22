package com.itheima.domain;

/**
 * @Author: MR.z
 * @Date: 2018/12/2 18:20
 * @Version 1.0
 */
public class Emp {
    private int uid;
    private String uname;
    private String sex;
    private String tel;
    private String email;
    private String address;
    private int did;

    public Emp(String id) {
    }

    public Emp(int uid, String uname, String sex, String tel, String email, String address, int did) {
        this.uid = uid;
        this.uname = uname;
        this.sex = sex;
        this.tel = tel;
        this.email = email;
        this.address = address;
        this.did = did;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", sex='" + sex + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", did=" + did +
                '}';
    }
}
