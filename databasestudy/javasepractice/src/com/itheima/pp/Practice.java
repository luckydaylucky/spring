package com.itheima.pp;

import org.junit.Test;

import java.util.Random;

/**
 * @Author: MR.z
 * @Date: 2018/12/4 10:48
 * @Version 1.0
 */
public class Practice {
    public static void main(String[] args) {
        Random r = new Random();
//        boolean b = r.nextBoolean();
//        int i = r.nextInt();
        int i = r.nextInt(10);
        System.out.println(i);
    }
    @Test
    public void test(){
        byte[] bytes = new byte[10];
        for (int i = 0; i < bytes.length; i++) {
            int rnd = 0;
            for (int rad = nextInt(), n = Math.min(bytes.length - i,4); n-->0; rnd>>=8)
                bytes[i++] = (byte)rnd;
        }
    }
    @Test
    public void test2(){
        Random r = new Random();
        boolean b = r.nextBoolean();
//        int i = r.nextInt();
//        int i = r.nextInt(10);
        System.out.println(b);
    }

    private int nextInt() {
        return 0;
    }
    @Test
    public void test3(){
        System.out.println("helloworld");
    }
}
