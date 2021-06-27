package com.itheima.ArrayList;

import java.util.ArrayList;

public class Test2ArrayList {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();//使用构造方法创建对象，并且使用泛型<>限定添加元素只能为String
        list.add("123");
        list.add("456");
        list.add("789");
        //AL_remove(list);
        //AL_set(list);
        for(int i=0;i< list.size();i++)//size获取集合的长度
        {
            String temp=list.get(i);//通过get方法获取对应元素，类似于arr[i]
            System.out.println(temp);
        }

        AL_remove(list);
        ArrayList<String>list1=new ArrayList<>();//使用构造方法创建对象，并且使用泛型<>限定添加元素只能为String
        for_remove(list1);
    }

    private static void for_remove(ArrayList<String> list) {
        list.add("张三");
        list.add("test");
        list.add("test");
        list.add("abd");
        list.add("test");
        System.out.println("-----------------");
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if("test".equals(list.get(i)))//字符串相等使用equals判断，且用常量调用方法时可避免null变量调用方法产生的错误
            {
                list.remove(i);
                i--;//因为remove后会使得后面的元素会向上移动一格，为防止跳过，通过i--使索引位置也上移，遍历的相对位置不变
            }
        }
        System.out.println(list);
    }

    private static void AL_set(ArrayList<String> list) {
        String S_set=list.set(0,"abc");//返回的是被替换的元素
        System.out.println("-----------------");
        System.out.println(S_set);
        System.out.println(list);
    }

    private static void AL_remove(ArrayList<String> list) {//自定义删除类的成员方法
        System.out.println("-----------------");
        //list.remove(0);//指定删除第0个索引位置，亦为 list.remove(“123”);
//        boolean b1=list.remove("123");
//        System.out.println(b1);//返回是否成功
        String s_remove= list.remove(0);//返回的是删除掉的元素
        System.out.println(s_remove);
        System.out.println(list);
    }


}
