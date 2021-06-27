package com.itheima.array;

//数组反转
public class array_convert {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        for(int start=0,end=arr1.length-1;start<end;start++,end--)
        {
            int temp=arr1[start];
            arr1[start]=arr1[end];
            arr1[end]=temp;
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
