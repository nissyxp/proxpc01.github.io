package com.use;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * description:
 * author: 熊万里
 */
public class SmallChangeProceduralProgramming {
    public static void main(String[] args) {
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        String key = "";
        String details = "-----------------零钱通明细------------------";
        double money = 0;
        double balance = 0;
        Date date = null; // date 是 java.util.Date 类型，表示日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm"); //可以用于日期格式化的
        String note = "";

        do {
            System.out.println("\n================零钱通菜单===============");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退     出");
            System.out.println("请选择(1-4): ");
            key = scanner.next();

            switch (key) {
                case "1":
                    System.out.println(details);
                    break;
                case "2":
                    System.out.println("请输入收益金额：");
                    money = scanner.nextDouble();
                    if (money <= 0) {
                        System.out.println("收益不能小于等于0，请重新校验");
                        break;
                    }
                    balance += money;
                    date = new Date(); //获取当前日期
                    details += "\n收益入账\t+" + money + "\t" + sdf.format(date) +
                            "\t余额：" + balance;
                    break;
                case "3":
                    System.out.println("请输入消费金额：");
                    money = scanner.nextDouble();
                    if (money <= 0 || money > balance) {
                        System.out.println("消费金额应在0-" + balance + "之间，请重新校验");
                        break;
                    }
                    System.out.print("消费说明:");
                    note = scanner.next();
                    balance += money;
                    date = new Date(); //获取当前日期
                    details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) +
                            "\t余额：" + balance;
                    break;
                case "4":
                    String choice = "";
                    while (true) { //要求用户必须输入y/n ,否则就一直循环
                        System.out.println("你确定要退出吗? y/n");
                        choice = scanner.next();
                        if ("y".equals(choice) || "n".equals(choice)) {
                            break;
                        }
                    }
                        if (choice.equals("y")) {
                            loop = false;
                        }
                        break;
                        default:
                            System.out.println("您输入的key不符合要求，请尝试重新输入，程序稍后退出");
                    }
            }
            while (loop) ;
            System.out.println("程序已退出~");

        }
    }
