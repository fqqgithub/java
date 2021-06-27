package com.itheima.stringBuilder;

public class Demo1stringbuilder
{
    public static void main(String[] args) {
        method();
        long start=System.currentTimeMillis();//获取从1970年到现在的毫秒值
        StringBuilder strB=new StringBuilder();//使用构造方法实例化对象
        for(int i=0;i<10000;i++)//(初始条件;bool条件;跟新)
        {
            strB.append(i);//字符串拼接
        }
        long end=System.currentTimeMillis();
        System.out.println("strB时间"+(end-start));
    }

    private static void method() {
        long start=System.currentTimeMillis();//获取从1970年到现在的毫秒值
        System.out.println("开始时间"+start);//运用+进行字符串拼接
        String s="";
        for(int i=0;i<10000;i++)//(初始条件;bool条件;跟新)
        {
            s=s+i;//字符串拼接
        }
        long end=System.currentTimeMillis();
        System.out.println("string时间"+(end-start));
    }
}
