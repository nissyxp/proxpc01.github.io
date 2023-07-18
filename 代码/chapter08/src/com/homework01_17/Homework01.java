package com.homework01_17;

/**
 * description:
 * author: 熊万里
 */
public class Homework01 {
    public static void main(String[] args) {
        Person[] persons = new Person[3];//定义方式是对象数组的方式，类似定义String[]，以对象类型来定义数组
        persons[0] = new Person("tom", 60, "算法工程师");
        persons[1] = new Person("jack", 30, "php工程师");
        persons[2] = new Person("smith", 50, "java工程师");
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }
        Person temp = null;//对象可以置空，当做临时变量来使用
        for (int i = 0; i < persons.length - 1; i++) {//外层循环需要的比较次数
            for (int j = 0; j < persons.length - 1 - i; j++) {//内层循环，每轮比较次数
                if (persons[j].getName().length() < persons[j + 1].getName().length()) {
                    temp = persons[j];
                    persons[j] = persons[j + 1];
                    persons[j + 1] = temp;
                }
            }
        }
        System.out.println("=========分割线=========");
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }

    }
}

class Person{
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

}
