package com.itheima.oop;

public class TestDemo {
    public static void main(String[] args) {
        Demo d1=new Demo();//调用无参构造方法
        d1.setName("d1");
        d1.setAge(11);
        d1.show();

        Demo d2=new Demo("d2",22);//调用有参构造方法对成员变量赋值
        d2.show();
    }
}
