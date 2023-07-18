package com.instance_and_final;

/**
 * description:
 * author: 熊万里
 */
public class GirlFriend {
    private String name;
    private static GirlFriend gf = new GirlFriend("小红");//饿汉式单例模式

    private GirlFriend(String name) {//构造器私有化
        this.name = name;
    }

    public static GirlFriend getInstance() {//公共的静态返回方法，返回类加载时就创建的单例对象
        return gf;
    }

    public static void main(String[] args) {
        //主方法由java虚拟机调用，2者不在同一个类中，故用public，
        //虚拟机执行main方法，不用创建对象，故必须用static，虚拟机也无需返回什么，即void即可
        System.out.println(Cat.num);
    }
}

class Cat {
    public static final int num = 100;
    private String name;
    private static Cat cat;//此处静态属性先不new

    static {
        System.out.println("喵喵喵喵喵喵");
    }

    private Cat(String name) {//构造器私有化
        this.name = name;
    }

    public static Cat getInstance() {//懒汉式单例模式
        if (cat == null) {
            //容易造成线程安全问题
            cat = new Cat("小白白");
        }
        return cat;
    }

}

