package com.itheima.pojo;

import java.util.Date;

/**
 * @Author: MR.z
 * @Date: 2018/12/15 0:49
 * @Version 1.0
 */
public class Item {
    private int id;
    private String name;
    private float price;
    private Date createtime;
    private String detail;
    private String pic;

    public Item() {
    }

    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Item(int id, float price, Date createtime, String detail, String pic) {
        this.id = id;
        this.price = price;
        this.createtime = createtime;
        this.detail = detail;
        this.pic = pic;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", createtime=" + createtime +
                ", detail='" + detail + '\'' +
                ", pic='" + pic + '\'' +
                '}';
    }
}
