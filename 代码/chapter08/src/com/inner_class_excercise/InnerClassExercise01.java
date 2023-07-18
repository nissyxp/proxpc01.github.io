package com.inner_class_excercise;

/**
 * description:
 * author: 熊万里
 */
public class InnerClassExercise01 {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        cellPhone.alarmclock(new Bell() {
            //匿名内部类，下方的重写对应的类对象只有系统取的名字 InnerClassExercise01$1 这一个
            
            @Override
            public void ring() {
                System.out.println("懒猪起床了");
            }
        });

//        cellPhone.alarmclock(new Bell() {
//            //匿名内部类当做实参传入，使用一次就后续被GC，简洁高效
//            @Override
//            public void ring() {
//                System.out.println("小伙伴们，上课了");
//            }
//        });
    }
}

interface Bell {
    void ring();//接口中的抽象方法
}

class CellPhone {
    public void alarmclock(Bell bell) {
        bell.ring();
        System.out.println(bell.getClass());
        System.out.println(bell.toString());
    }
}
