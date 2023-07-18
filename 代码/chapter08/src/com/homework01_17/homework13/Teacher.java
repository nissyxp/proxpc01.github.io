package com.homework01_17.homework13;

/**
 * description:
 * author: 熊万里
 */
public class Teacher extends Person{
    private int work_age;

    public Teacher(String name, char gender, int age, int work_age) {
        super(name, gender, age);
        this.work_age = work_age;
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }

    @Override
    public String toString() {
        return super.toString() + "Teacher{" +
                "work_age=" + work_age +
                '}';
    }

    public void teach() {
        System.out.println(getName() + "承诺，我会认真教学");
    }

    @Override
    public String play() {
        return super.play() + "象棋";
    }

    public void printInfo() {
        System.out.println("老师的信息");
        super.basicInfo();
        System.out.println("工龄：" + getWork_age());
        teach();
        System.out.println(play());
    }
}
