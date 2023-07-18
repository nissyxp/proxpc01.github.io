package com.homework01_17.homework13;

/**
 * description:
 * author: 熊万里
 */
public class Homework13 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("mary", '女', 30, 5);
        teacher.printInfo();
        System.out.println("-----------------------");
        Student student = new Student("jack", '男', 18, "00023102");
        student.printInfo();

        /**
         *利用多态数组定义形式和向上转型，批量对对象进行方法调用操作，思想很重要，
         * 只是鉴于数组无法轻易动态递增的特性，后期可以改成map形式来对向上转型的实例化对象进行批量调用操作
         */
        System.out.println("-----------------------");
        Homework13 homework13 = new Homework13();
        com.homework01_17.homework13.Person[] p = new com.homework01_17.homework13.Person[4];
        //多态对象数组，利用向上转型，父类引用指向子类实例对象
        p[0] = new Student("学生1", '男', 17, "00000002");
        p[1] = new Student("学生2", '女', 15, "00000006");
        p[2] = new Teacher("老师1", '男', 30, 5);
        p[3] = new Teacher("老师2", '男', 28, 3);
        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i]);
        }

        System.out.println("-----------------------");
        homework13.bubbleSort(p);
        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i]);
        }

        System.out.println("-----------------------");
        for (int i = 0; i < p.length; i++) {
            homework13.test(p[i]);
        }

    }

    //冒泡排序方法写在主方法对应的类下，做成工具类的形式方便主方法调用
    public void bubbleSort(com.homework01_17.homework13.Person[] p) {
        com.homework01_17.homework13.Person temp = null;
        for (int i = 0; i < p.length - 1; i++) {
            for (int j = 0; j < p.length - 1 - i; j++) {
                if (p[j].getAge() < p[j + 1].getAge()) {//按年龄从高到低
                    temp = p[j];
                    p[j] = p[j + 1];
                    p[j + 1] = temp;
                }
            }
        }
    }

    //多态调用各个不同的运行类型，所对应的调用子类特有方法，加入instance of比较
    public void test(Person person) {
        if (person instanceof Student) {
            ((Student) person).study();
        } else if (person instanceof Teacher) {
            ((Teacher) person).teach();
        } else {
            System.out.println("do nothing...");
        }
    }

}