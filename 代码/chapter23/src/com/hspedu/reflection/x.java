package com.hspedu.reflection;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * description:
 *
 * @author 熊万里
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class x {
    public static void main(String[] args) {
        int[] arr = {20, 50, 70, 10, 3, 55, 99, 13};
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (int) (Math.random() * 100);//[0,1)->[0,100)取整
//        }
        x.arry(arr);
        System.out.println(Arrays.toString(arr));
    }


    @Test
    public static void arry(int[] arr) {
        int a = arr.length;
        int temp;
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < a - 1; i++) {
            for (int j = 0; j < a - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    ++index1;
                }
            }
            if (index2 == index1) {
                System.out.println("已调整 " + index1 + " 次");
                break;
            } else {
                index2 = index1;
            }
        }
    }
}

