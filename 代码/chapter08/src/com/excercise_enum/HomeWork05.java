package com.excercise_enum;

import newlearning.hspedu.super_.B;

/**
 * description:
 *
 * @version 1.0
 * @author: 熊万里
 */
public class HomeWork05 {
    public static void main(String[] args) {
        new A().XXX();

    }
}

class A {
    private String name = "hello";

    public A(String name) {
        this.name = name;
    }

    public A() {
    }

    public String getName() {
        return name;
    }

    public void XXX() {
        class B {
            private final String NAME = "emmmm";

            public void show() {
                //访问遵循就近访问原则
                System.out.println("打印局部内部类的name结果： " + NAME);
                System.out.println("打印外部类的name结果： " + A.this.name);
            }
        }
        B b = new B();
        b.show();
    }


}

