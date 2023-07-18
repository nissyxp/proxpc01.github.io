package com.excercise_enum;

import org.omg.CORBA.ShortSeqHelper;

/**
 * description:
 *
 * @version 1.0
 * @author: 熊万里
 */
public class HomeWork06 {
    public static void main(String[] args) {
        Person tang = new Person("唐僧", new Horse());
        tang.commom();
        tang.passRiver();
        tang.commom();
        tang.commom();
        tang.passRiver();
        tang.passMountain();
        tang.commom();
        tang.passMountain();
    }
}

interface Vehicles {
    void work();
}

class Horse implements Vehicles {

    @Override
    public void work() {
        System.out.println("一般情况下使用马儿");
    }
}

class Boat implements Vehicles {

    @Override
    public void work() {
        System.out.println("遇到河，使用船");
    }
}

class Plane implements Vehicles{

    @Override
    public void work() {
        System.out.println("遇到火焰山，使用飞机");
    }
}

class VehiclesFactory {//工厂工具类,返回工具的对应实例对象
    private static Horse horse = new Horse();//饿汉式单例模式

    private VehiclesFactory(){}//私有化构造器，防止外部new对象，破坏单例

    public static Horse getHorse() {//静态方法，方便用工具类.静态方法，直接调用
        //return new Horse();
        return horse;
    }

    public static Boat getBoat() {
        return new Boat();
    }

    public static Plane getPlane(){return new Plane();}
}

class Person {
    private String name;
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    public void commom() {
        if (!(vehicles instanceof Horse)) {
            vehicles = VehiclesFactory.getHorse();//getHorse()方法返回对应的具体实例对象，进行向上转型
        }
        vehicles.work();//接口名向上转型后，运行时进行动态绑定
    }

    public void passRiver() {
        if (!(vehicles instanceof Boat)) {
            vehicles = VehiclesFactory.getBoat();
        }
        vehicles.work();
    }

    public void passMountain(){
        if(!(vehicles instanceof Plane)){
            vehicles = VehiclesFactory.getPlane();
        }
        vehicles.work();
    }

}