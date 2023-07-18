package com.homework01_17.homework13;

/**
 * description:
 * author: 熊万里
 */
public class Student extends Person{
    private String stu_id;

    public Student(String name, char gender, int age, String stu_id) {
        super(name, gender, age);
        this.stu_id = stu_id;
    }

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }

    @Override
    public String toString() {
        return super.toString() + "Student{" +
                "stu_id='" + stu_id + '\'' +
                '}';
    }

    public void study() {
        System.out.println(getName() + "承诺，我会好好学习");
    }

    @Override
    public String play() {
        return super.play() + "足球";
    }

    public void printInfo() {//体现了一种组合的思想
        System.out.println("学生的信息");
        super.basicInfo();//调用父类方法
        System.out.println("学号：" + getStu_id());//调用本子类get方法
        study();//调用本子类方法
        System.out.println(play());//调用本类play方法，其自己里面又super了父类的play方法
    }
}
