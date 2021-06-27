package com.itheima.array;

public class array2{
    public static void main(String[] args) {
       /*
        数组类型的变量记录的是地址
        当多个数组指向相同时，一个数组的变化也会引起另一个数组的变化
        只有new关键字才会开辟空间
     */
        int[] arr1=new int[2];
        System.out.println(arr1);//数组类型的变量记录的是地址
        arr1[0]=0;
        arr1[1]=1;
        int[] arr2=arr1;//把arr1的地址值赋给arr2
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        arr2[0]=11;// 当多个数组指向相同时，一个数组的变化也会引起另一个数组的变化
        System.out.println(arr1[0]);
    }



}
