package com.excercise_enum;

/**
 * description:
 *
 * @version 1.0
 * @author: 熊万里
 */
@SuppressWarnings("all")
public class HomeWork07 {
    public static void main(String[] args) {
        Car car01 = new Car(50);
        Car car02 = new Car(30);
        Car car03 = new Car(-10);
        car01.getAir().flow();
        car02.getAir().flow();
        car03.getAir().flow();
    }
}

@SuppressWarnings("all")
class Car {
    private double temperture;
//    private static Air air = new Air();


    public Car(double temperture) {
        this.temperture = temperture;
    }
    //Air 成员内部类
    class Air {
        private double temperture_ = Car.this.temperture;

        public void flow() {
            if (Car.this.temperture > 40) {
                System.out.println("车内温度高于40度，吹冷风...");
            } else if (Car.this.temperture < 0) {
                System.out.println("车内温度低于0度，吹热风...");
            } else {
                System.out.println("温度在0-40度之间，关闭空调...");
            }
        }

    }

    public Air getAir() {//使用成员内部类，写个 返回成员内部类的实例对象的 方法
        return new Air();
    }

}
