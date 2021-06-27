package com.itheima.string;

public class method_equal {
    public static void main(String[] args) {
        String s1="abc";
        String s2="ABC";
        String s3=new String("abc");

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));//equals方法比较的是字符串的内容，s1和s3的地址虽然不同（常量池和堆内存），但其内容相同
        System.out.println(s1.equalsIgnoreCase(s2));//忽略大小写
    }
}
