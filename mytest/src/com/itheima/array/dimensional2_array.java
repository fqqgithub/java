package com.itheima.array;

public class dimensional2_array {
    public static void main(String[] args) {
        int[] arr1={1,2,3};
        int[] arr2={3,4,6,7};
        int[][] arr_double=new int[2][3];//创建两行三列二维数组
        System.out.println("arr1地址"+arr1);
        System.out.println("arr2地址"+arr2);
        System.out.println("arr_double[0]地址"+arr_double[0]);//二维数组中的一维数组存的是一维数组的地址
        System.out.println("arr_double[1]地址"+arr_double[1]);
        arr_double[0]=arr1;//将一维数组的地址赋给二维数组的行地址
        arr_double[1]=arr2;
        System.out.println("arr_double[0]地址"+arr_double[0]);
        System.out.println("arr_double[1]地址"+arr_double[1]);

        System.out.println(arr_double[1][3]);//因为把二维数组中的行地址替换了，这里访问的是具有4个元素的一维数组，故与原来的二维数组大小不冲突

        int[][] arr_double2={arr1,arr2};
        System.out.println("静态初始化"+arr_double2[1][3]);
    }
}
