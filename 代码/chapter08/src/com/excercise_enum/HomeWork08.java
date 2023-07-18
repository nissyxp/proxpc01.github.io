package com.excercise_enum;

/**
 * description:
 *
 * @version 1.0
 * @author: 熊万里
 */
public class HomeWork08 {
    public static void main(String[] args) {
        Color blue = Color.BLUE;
        blue.show();

    }
}

interface ColorShow {
    void show();
}

@SuppressWarnings("all")
enum Color implements ColorShow {
    RED(255, 0, 0), BLUE(0, 0, 255),
    BLACK(0, 0, 0), YELLOW(255, 255, 0),
    GREEN(0, 255, 0);

    private int redValue;
    private int greenValue;
    private int blueValue;

    Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    @Override
    public void show() {
        System.out.println("redValue:" + redValue + "  greenValue:" + greenValue + "  blueValue:" + blueValue);
    }
}

