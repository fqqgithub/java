package com.itheima.array;

import java.util.*;

public class array_for {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入");
        int[] arr1={19,55,11,33,66};
        //int num=sc.nextInt();
        Arrays.sort(arr1);//对数组进行升序排列11，19，33，55，66
        for(int k:arr1)
        {
            System.out.println("k的值是"+k);
        }
        int[] arr2=arr1;
        arr2=null;//只是arr2的地址发生变化,arr1的地址不变（赋值是从左往右）（数组变量赋的是地址）
        System.out.println(arr2);
        System.out.println(arr1);
        int a1=Arrays.binarySearch(arr1,33);//返回索引位置
        int a2=Arrays.binarySearch(arr1,22);//返回-插入点-1
        System.out.println("33的位置"+a1);
        System.out.println("22的位置"+a2);

        //向量
        System.out.println("-----------------------------向量");
        Vector v=new Vector();//声明向量
        v.add("x");
        v.add("a");
        v.add("m");
        Collections.sort(v);//按升序排序
        System.out.println(v);
        int index1=Collections.binarySearch(v,"a");
        int index2=Collections.binarySearch(v,"b");
        System.out.println("a的位置"+index1);
        System.out.println("b的位置"+index2);

    }

}
