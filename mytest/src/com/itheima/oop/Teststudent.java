package com.itheima.oop;

public class Teststudent {
    public static void main(String[] args) {
        //类名 对象=new 类名();
        student stu=new student();//类的实例化

        //调用成员变量（对象名.变量名）
        System.out.println(stu.name);//null（默认初始化值），成员变量存在于堆内存中
        System.out.println(stu.age);//0
        stu.age=23;
        stu.name="fqq";
        System.out.println(stu.name);
        System.out.println(stu.age);

        //调用方法（对象名.方法名（））
        stu.study();

        System.out.println(stu);//com.itheima.oop.student@7ef20235

        student stu2=new student();//新new的stu2在堆内存中的地址和stu1是不同的,堆内存地址内包含的成员变量也是不同的，但是其方法地址都是指向同一块方法区，是相同的
        System.out.println(stu2);//com.itheima.oop.student@27d6c5e0

        student stu3=stu;//stu是对象（引用变量），将stu的地址赋给stu3
        stu3.name="改变啦";
        System.out.println(stu.name);//因为对象指向的是同一块地址，一个对象的改变会引起另一个对象的改变

    }
}
