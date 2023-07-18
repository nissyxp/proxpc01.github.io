package com.instance_and_final;

/**
 * description:
 * author: 熊万里
 */
public class FinalExercise01 {
    public static void main(String[] args) {
        System.out.println(Circle.getInstance().getArea(3.0));
    }
}

class Circle {
    private double radius;
    private static Circle circle = new Circle();//单例模式的饿汉模式
    private static final double PI = 3.14;

    public Circle() {
    }

    private Circle(double radius) {
        this.radius = radius;
    }

    public static Circle getInstance() {
        return circle;
    }

    public double getArea(double radius) {//静态方法，当做工具类用
        return PI * radius * radius;
    }

    double getRadius(){
        return radius;
    }

    protected double getPi(){
        return PI;
    }
}

class B extends Circle{
    private String words;

    public B(String words) {
        this.words = words;
    }

    @Override
    public double getArea(double radius) {
        return super.getArea(radius);
    }

    @Override
    double getRadius() {
        return super.getRadius();
    }

    @Override
    protected double getPi() {
        return super.getPi();
    }
}