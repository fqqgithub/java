package com.itheima.oop;

//类包括属性和方法两部分

public class student {
    //属性通过成员变量体现（类中，方法外）
    //成员变量
    String name;
    int age;

    //方法（去掉static）
    public void study(){
        System.out.println("学习");
    }

    /*
        构造方法：
        1.方法名和类名相同，大小写一致
        2.没有返回值类型，连void也没有
        3.没有具体返回值（不能有return语句）
     */
    public  student(){//默认构造方法
        System.out.println("构造方法在创建对象时就会运行");
    }

    public student(String name, int age) {//有参构造方法
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
};
