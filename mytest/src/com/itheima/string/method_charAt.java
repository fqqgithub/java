package com.itheima.string;

import java.util.Scanner;

public class method_charAt {
    public static void main(String[] args) {
        //字符串录入
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入：");
        String s=sc.nextLine();//通过nextline方法获得字符串对象
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);//返回指定索引处的字符值
            System.out.println(c);
        }
        //toCharArray()将字符串拆分为字符数组
        char[] c1=s.toCharArray();
        System.out.println(c1);
        for(int i=0;i<c1.length;i++)
        {
            char my_c=c1[i];//通过字符串数组获得对应索引字符
            System.out.println(my_c);
        }
    }
}
