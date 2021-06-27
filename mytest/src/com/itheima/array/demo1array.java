package com.itheima.array;

public class demo1array {
    /*数组定义：
        1.数据类型[] 数组名;
    */
    public static void main(String[] args) {

        int[] iarr;//声明数组，仅仅是一个数组类型的变量，还没有进行初始化
        char[] carr;


        //初始化，为数组开辟内存 空间，并存入数据
        //动态初始化，指定数组长度
        int[] arr=new int[5];//通过new关键字创建并动态初始化
        System.out.println(arr);//通过打印数组名可以得到数组内存地址
        /*
            [:当前空间是数组类型
            I：当前数组类型为int类型
            @：分隔符
            16b98e56：其具体16进制内存地址
        */
    }
}
