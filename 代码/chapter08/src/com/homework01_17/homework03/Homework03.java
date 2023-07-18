package com.homework01_17.homework03;

import java.math.BigDecimal;
/**
 * description:
 * author: 熊万里
 */
public class Homework03 {
    public static void main(String[] args) {
//        Worker tom = new Worker("tom", 3000);
//        tom.setSalMonth(13);
//        tom.printSal();
//        Teacher jack = new Teacher("jack", 5000);
//        jack.setSalMonth(15);
//        jack.setClassSal(100);
//        jack.setClassDays(300);
//        jack.printSal();
        System.out.println(add(12,22));

    }
    public static double add(double a1,double b1){
        //把需要的精确运算，写成工具类的方法，放在class Homework03中，方便在主方法中直接调用来运算
        BigDecimal a2 = new BigDecimal(Double.toString(a1));
        BigDecimal b2 = new BigDecimal(Double.toString(b1));
        return a2.add(b2).doubleValue();
    }

}

class Employee {
    private String name;
    private double sal;
    private int salMonth = 12;

    public void printSal() {
        System.out.println("姓名：" + name + "\t全年工资：" + (sal * salMonth));
    }

    public Employee(String name, double sal) {
        this.name = name;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public int getSalMonth() {
        return salMonth;
    }

    public void setSalMonth(int salMonth) {
        this.salMonth = salMonth;
    }
}

class Worker extends Employee {
    public Worker(String name, double sal) {
        super(name, sal);
    }

    @Override
    public void printSal() {
        System.out.println("工人：");
        super.printSal();
    }
}

class Teacher extends Employee {
    private int classDays;
    private double classSal;

    @Override
    public void printSal() {
        System.out.println("教师：");
        System.out.println("姓名：" + getName() + "\t全年工资："
                + (getSal() * getSalMonth() + getClassDays() * getClassSal()));
    }

    public Teacher(String name, double sal) {
        super(name, sal);
    }

    public int getClassDays() {
        return classDays;
    }

    public void setClassDays(int classDays) {
        this.classDays = classDays;
    }

    public double getClassSal() {
        return classSal;
    }

    public void setClassSal(double classSal) {
        this.classSal = classSal;
    }
}