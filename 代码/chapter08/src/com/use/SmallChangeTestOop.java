package com.use;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
/**
 * description:
 * author: 熊万里
 */
public class SmallChangeTestOop {
    //属性..
    //定义相关的变量
    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    String key = "";

    //2. 完成零钱通明细
    //老韩思路, (1) 可以把收益入账和消费，保存到数组 (2) 可以使用对象 (3) 简单的话可以使用String拼接
    String details = "-----------------零钱通明细------------------";

    //3. 完成收益入账  完成功能驱动程序员增加新的变化和代码
    //老韩思路, 定义新的变量
    double money = 0;
    double balance = 0;
    Date date = null; // date 是 java.util.Date 类型，表示日期
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm"); //可以用于日期格式化的

    //4. 消费
    //定义新变量，保存消费的原因
    String note = "";

    public void mainMenu() {
        do {
            System.out.println("\n================零钱通菜单===============");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退     出");
            System.out.println("请选择(1-4): ");
            key = scanner.next();
            //下面default已经是对非1234的判定解释，这里就无需对key做if非设定下的判定，无需过关斩将样式的排除情况
            switch (key) {
                case "1":
                    this.details();
                    break;
                case "2":
                    this.income();
                    break;
                case "3":
                    this.pay();
                    break;
                case "4":
                    this.exit();
                    break;
                default:
                    System.out.println("您输入的key不符合要求，请尝试重新输入");
            }
        }
        while (loop);
        System.out.println("程序已退出~");
    }

    public void details(){
        System.out.println(details);
    }

    public void income(){
        System.out.println("请输入收益金额：");
        money = scanner.nextDouble();
        if (money <= 0) {
            System.out.println("收益不能小于等于0，请重新校验");
            return;
        }
        balance += money;
        date = new Date(); //获取当前日期
        details += "\n收益入账\t+" + money + "\t" + sdf.format(date) +
                "\t余额：" + balance;
    }

    public void pay(){
        System.out.println("请输入消费金额：");
        money = scanner.nextDouble();
        if (money <= 0 || money > balance) {
            System.out.println("消费金额应在0-" + balance + "之间，请重新校验");
            return;
        }
        System.out.print("消费说明:");
        note = scanner.next();
        balance += money;
        date = new Date(); //获取当前日期
        details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) +
                "\t余额：" + balance;
    }

    public void exit(){
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
    }


}
