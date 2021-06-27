package com.itheima.ArrayList;

import com.itheima.oop.student;//由于student类不在对应文件夹下，需要通过import导包
import  java.util.ArrayList;//导包
public class TestArrayList {
    public static void main(String[] args) {
        student[] stuarr=new student[3];//创建student类型的对象数组，内部存储的是对象
        student stu1=new student("A",1);
        student stu2=new student("B",2);
        student stu3=new student("C",3);
        stuarr[0]=stu1;
        stuarr[1]=stu2;
        stuarr[2]=stu3;
        for (int i = 0; i < stuarr.length; i++) {
            System.out.println(stuarr[i]);//打印的是student对象的地址,即数组中存的就是对象的地址
            student tempstu=stuarr[i];//通过赋值（将stuarr[i]的地址给tempstu）创建对象
            System.out.println(tempstu.getAge()+"..."+tempstu.getName());
        }

        ArrayList<String> list=new ArrayList<String>();//使用空参构造方法创建对象,<>泛型对存储数据进行限制
        list.add("123");//由于限定<>未string只能添加字符串类型
        list.add("456");//正常都是在集合末尾进行添加
        list.add(0,"000");//双参数的第一个参数指的是元素插入的索引位置
        System.out.println(list);

        //创建student的集合对象
        ArrayList<student> AL_stu=new ArrayList<>();//使用new通过构造方法创建对象
        AL_stu.add(stu1);
        AL_stu.add(stu2);
        AL_stu.add(stu3);
        for (int i = 0; i < AL_stu.size(); i++) {
            student temp=AL_stu.get(i);//因为集合存储的是student类型的对象，所以赋值时使用student temp
            System.out.println(temp);//集合存储的是student对象的地址
        }

    }
}
