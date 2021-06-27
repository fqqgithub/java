package com.itheima.ArrayList;
import java.util.ArrayList;//导包
import java.util.Scanner;

public class AL_Manage {
    public static void main(String[] args) {
        ArrayList<Studentclass>list=new ArrayList<>();//<>泛型限定存储的引用数据类型，通过new的构造函数创建集合对象

        //1.搭建主界面
        Scanner sc=new Scanner(System.in);//定义键盘输入对象
        System.out.println("------欢迎来到学生管理系统--------");
        System.out.println("1.添加学生");
        System.out.println("2.删除学生");
        System.out.println("3.修改学生");
        System.out.println("4.查看学生");
        System.out.println("5.推出");
        System.out.println("请输入您的选择");
        lo:while (true){
            String key=sc.next();//通过scanner的next方法获得字符串
            switch (key){
                case "1":
                    addstudent(list, sc);
                    break;
                case "2":
                    Studentremove(list, sc);
                    break;
                case "3":
                    setStudent(list, sc);
                    break;
                case "4":
                    showcode(list);
                    break;
                case "5":
                    System.out.println("感谢您的使用");
                    break lo;//跳出指定标号的循环即lo的while
                default://无匹配值
                    System.out.println("您的输入有误");
                    break;
            }
        }


    }

    public static void setStudent(ArrayList<Studentclass> list, Scanner sc) {
        System.out.println("请输入你要修改的学号");
        String code= sc.next();
        int index=-1;
        for (int i = 0; i < list.size(); i++) {
            Studentclass stu= list.get(i);
            if(code.equals(stu.getCode()))
            {
                System.out.println("请输入学号");
                String new_code= sc.next();
                System.out.println("请输入姓名");
                String name= sc.next();
                System.out.println("请输入年龄");
                int age= sc.nextInt();
                System.out.println("请输入生日");
                String birth= sc.next();
                Studentclass new_stu=new Studentclass(new_code,name,birth,age);
                list.set(i,new_stu);
                index=i;
            }

        }
        if(index==-1)
        {
            System.out.println("学号不存在");
        }
    }

    private static void Studentremove(ArrayList<Studentclass> list, Scanner sc) {

        System.out.println("请输入你要删除的学号");
        String code= sc.next();
        int index = getIndex(list, code);
        if(index==-1)
        {
            System.out.println("学号不存在");
        }
        else list.remove(index);

    }

    private static int getIndex(ArrayList<Studentclass> list, String code) {
        int index=-1;//假设不存在（标志位若存在则会改变）
        for (int i = 0; i < list.size(); i++) {
            Studentclass stu= list.get(i);
            if(code.equals(stu.getCode()))
            {

                index=i;
            }

        }
        return index;
    }

    public static void showcode(ArrayList<Studentclass> list) {
        if(list.size()>0)
        {
            System.out.println("学号\t姓名\t年龄\t生日");// \t是大空格
            for (int i = 0; i < list.size(); i++) {
                Studentclass stu= list.get(i);//通过集合get获取学生对象（地址）
                System.out.println(stu.getCode()+"\t"+stu.getName()+"\t"+stu.getAge()+"\t"+stu.getBrith());
            }
        }
        else System.out.println("无信息，请添加");

    }

    public static void addstudent(ArrayList<Studentclass> list, Scanner sc) {
        String code;//定义全局变量
        while(true)
        {
            System.out.println("请输入学号");
            code= sc.next();//防止在此处定义code使得作用域仅局限于while
            if(getIndex(list,code)==-1)
            {
                break;//无重复，推出输入的无限循环
            }
            else System.out.println("请重新输入");
        }

        System.out.println("请输入姓名");
        String name= sc.next();
        System.out.println("请输入年龄");
        int age= sc.nextInt();
        System.out.println("请输入生日");
        String birth= sc.next();
        Studentclass stu=new Studentclass(code,name,birth,age);//通过new的构造函数创建集合对象
        list.add(stu);
        System.out.println("添加成功");
    }
}
