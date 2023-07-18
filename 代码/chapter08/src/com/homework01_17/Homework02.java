package com.homework01_17;

/**
 * description:
 * author: 熊万里
 */
public class Homework02 {
    public static void main(String[] args) {
        Worker tom = new Worker("tom", 200, 22, 1.0);
        tom.printSalary();
        Manager jack = new Manager("jack", 300, 22, 1.2);
        jack.setBonus(2000);
        jack.printSalary();

    }
}

class Employee {
    private String name;
    private double daySalary;
    private int days;
    private double grade;

    public double basicSalary() {//写一个计算基本工资的方法，返回数值来供子类去调用,体现复用性
        return getDaySalary() * getDays() * getGrade();
    }

    public void printSalary() {
        System.out.println("姓名：" + name + "\t工资："
                + this.basicSalary());
    }

    public Employee(String name, double daySalary, int days, double grade) {
        this.name = name;
        this.daySalary = daySalary;
        this.days = days;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDaySalary() {
        return daySalary;
    }

    public void setDaySalary(double daySalary) {
        this.daySalary = daySalary;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

}

class Manager extends Employee {
    private double bonus;

    public Manager(String name, double daySalary, int days, double grade) {
        super(name, daySalary, days, grade);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void printSalary() {
        System.out.print("经理级别\t");
        System.out.println("姓名：" + this.getName() + "\t工资："
                + (this.bonus + this.basicSalary()));//数值的和要用括号括起来，来让2个数值相加得到最后显示的和
    }
}

class Worker extends Employee{
    public Worker(String name, double daySalary, int days, double grade) {
        super(name, daySalary, days, grade);
    }

    @Override
    public void printSalary() {//重写父类信息
        System.out.print("员工级别\t");
        super.printSalary();
    }
}