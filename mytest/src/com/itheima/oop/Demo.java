package com.itheima.oop;
//JavaBean类：用于封装数据
public class Demo {
    private  String name;
    private  int age;//私有型变量，只能通过方法来进行修改
    /*
        无参构造方法和有参构造方法构成了方法的重载
     */
    //无参数构造方法
    public Demo() {//默认构造方法

    }

    //有参数构造方法
    public Demo(String name, int age) {
        this.name = name;//this指向被调用的对象（地址），this.name指向堆内存中的成员变量
        this.age = age;
    }

    public String getName() {
        return name;//根据就近原则，这里的name指的是成员变量
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
    public  void show(){
        System.out.println(this.name+this.age);
    }
}
