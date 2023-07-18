package com.excercise_enum;

/**
 * description:
 *
 * @version 1.0
 * @author: 熊万里
 */
public class HomeWork02 {
    public static void main(String[] args) {
        System.out.println(Frock.getNextNum());
        System.out.println(Frock.getNextNum());

        Frock frock01 = new Frock();
        Frock frock02 = new Frock();
        Frock frock03 = new Frock();
        System.out.println(frock01.getSerialNumber());
        System.out.println(frock02.getSerialNumber());
        System.out.println(frock03.getSerialNumber());
    }
}


class Frock {
    private static int currentNum = 100000;
    //静态属性只会加载一次，后续的这个类的实例对象是共享这个静态属性值
    private int serialNumber;

    public static int getNextNum() {
        currentNum += 100;
        return currentNum;
    }

    public Frock() {
        this.serialNumber = getNextNum();
    }

    public int getSerialNumber() {
        return serialNumber;
    }
}
