package com.itheima.method;

public class args {
    public static void main(String[] args) {
        /*
             1.两个number是不一样的两个变量
             2.基本参数传递 传递的是具体的值，方法内的数据（形参）变化不会对方法外的数据（实参）产生影响
             3.方法的重载，方法名相同，方法的参数不同（类型，数量，顺序）
             4.引用数据传递（如数组），传递的是地址（形参和实参地址相同），一个数据的变化会引起另一个的变化
         */
        int number=100;
        System.out.println("改变前"+number);
        change(number);
        System.out.println("改变后"+number);
        int[] arr={1,2,3};
        System.out.println("地址1"+arr);
        change(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("改变后数组"+arr[i]);
        }
    }
    public  static  void change(int number)
    {
        number=200;
    }
    public  static  void change(int[] number)
    {
        System.out.println("地址2"+number);
        for (int i = 0; i < number.length; i++) {
            number[i]=number[i]+1;
        }
    }
}
