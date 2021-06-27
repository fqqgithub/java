package com.itheima.string;

/*

 */
public class string1 {


    public static void main(String[] args) {
        /*
        1.字符串是一个对象
        2.字符串是一个常量，他的值在创建后不能改
         */

        String ss1="adc";
        System.out.println(ss1);
        ss1="123";//这其实是记录了一个新的对象
        System.out.println(ss1);


        /*
            string类的构造方法
            1.public String();创建空白字符串对象，不含任何内容
            2.public String(char[] chs);根据字符数组chs的内容来创建字符串对象
            3.public String(String original);根据传入字符串内容创建字符串对象
            4.String s="abc";直接赋值的方式创建字符串对象
         */

        //1.public String();创建空白字符串对象，不含任何内容
        String s1=new String();
        System.out.println(s1);//String这个类比较特殊，打印其对象名是，不会出现内存地址（区别于数组）

        // 2.public String(char[] chs);根据字符数组chs的内容来创建字符串对象
        char[] chs={'a','b','c'};
        String s2=new String(chs);
        String s22=new String(chs);
        System.out.println(s2);
        System.out.println(s2==s22);//每new一次都会在堆内存中开辟一个空间，所以两个对象的地址是不同的

        //3.public String(String original);根据传入字符串内容创建字符串对象
        String s3=new String("abc");
        System.out.println(s3);





    }
}
