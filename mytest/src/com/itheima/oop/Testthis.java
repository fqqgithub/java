package com.itheima.oop;

public class Testthis {
    public static void main(String[] args) {
        mthis mt1=new mthis();//创建对象，初始化类
        System.out.println("mt1的地址"+mt1);
        mt1.setName("mt1");
        mthis mt2=new mthis();//创建对象，初始化类
        System.out.println("mt2的地址"+mt2);
        mt2.setName("mt2");
    }
}
