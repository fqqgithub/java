package com.itheima.oop;

//this可以调用本类成员变量（用于分别成员变量和局部变量）
//this相当于当前对象的本身（对象地址）
//方法被哪个对象调用，this就代表哪个对象
public class mthis {
    private String name;//私有变量
    public void setName(String name) {//通过setname方法来实现对私有成员变量的操作
        System.out.println("this"+this);//方法被哪个对象调用，this就代表哪个对象
        this.name = name;//this.name表示为成员变量
        System.out.println("name"+name);//方法被哪个对象调用，this就代表哪个对象
    }
}
