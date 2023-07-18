package com.excercise_enum;

/**
 * description:
 *
 * @version 1.0
 * @author: 熊万里
 */
@SuppressWarnings("all")
public class HomeWork04 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.testWork(new Calculate() {//匿名内部类作为传参直接传入
            @Override
            public double work(double n1, double n2) {
                return n1 + n2;
            }
        }, 10, 8);
    }
}

interface Calculate {
     double work(double n1, double n2);//设计为返回double类型的方法，方便testwork方法直接输出，省略接收的一步
}

class Cellphone {
    public void testWork(Calculate calculate, double n1, double n2) {
        System.out.println("计算的结果为： " + calculate.work(n1, n2));
    }
}