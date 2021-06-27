package com.itheima.ArrayList;

public class Studentclass {
    private String code;//学号
    private  String name;//姓名
    private  String brith;//生日
    private  int age;//年龄

    public static void main(String[] args) {

    }

    public Studentclass(String code, String name, String brith, int age) {//有参构造方法,无void无返回值
        this.code = code;
        this.name = name;
        this.brith = brith;
        this.age = age;
    }

    public Studentclass() {//无参构造方法
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrith() {
        return brith;
    }

    public void setBrith(String brith) {
        this.brith = brith;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
