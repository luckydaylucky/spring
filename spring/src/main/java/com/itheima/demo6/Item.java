package com.itheima.demo6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author: MR.z
 * @Date: 2018/12/11 11:46
 * @Version 1.0
 */
@Component("item")
public class Item {
    public void test(){
        System.out.println("使用注解得方式");
    }

    private int id;
    private String title;

    @Autowired
    private Dog dog;

    public Item() {
    }

    public Item(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", dog=" + dog +
                '}';
    }
}
