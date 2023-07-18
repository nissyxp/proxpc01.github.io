package com.excercise_enum;

/**
 * description:
 *
 * @version 1.0
 * @author: 熊万里
 */
public class enum_excercise01 {
    public static void main(String[] args) {
//        Week week = new Week();
//        Week[] values = Week.values();
        Week[] weeks = Week.values();
        System.out.println("===所有星期的信息如下===");
        for (Week i : weeks) {//增强for循环
            System.out.println(i);
        }
        Week.playing(new IPplaying() {//匿名内部类,当实参传入
            @Override
            public void playing() {
                System.out.println("播放好听的歌曲");
            }

            @Override
            public String toString() {
                return "歌曲名:xxx";
            }
        });

    }
}

interface IPplaying {
    public void playing();
}

enum Week implements IPplaying {
    MONDAY("星期一"), TUESDAY("星期二"), WEDNESDAY("星期三");

    private String name;

    private Week(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public static void playing(IPplaying IPplaying) {
        IPplaying.playing();
        System.out.println(IPplaying.getClass());
        System.out.println(IPplaying.toString());
    }

    @Override
    public void playing() {
        System.out.println("播放xx的歌曲");
    }
}



