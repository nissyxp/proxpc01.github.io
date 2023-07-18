package com.houserent.view;

import newlearning.hspedu.houserent.service.HouseService;
import newlearning.hspedu.houserent.utils.Utility;

/**
 * description:
 * author: 熊万里
 */
public class HouseView {//界面层，和用户进行交互，依赖Service层的数据逻辑实现来进行界面展示
    private boolean loop = true; //控制显示菜单
    private char key = ' '; //接收用户选择
    private HouseService houseService = new HouseService(2);//设置数组的大小为2


    public void mainMenu() {
        do {
            System.out.println("----------------房屋列表----------------");
            System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(未出租/已出租)");
            System.out.println("\t\t\t1 新增房源");
            System.out.println("\t\t\t2 查找房源");
            System.out.println("\t\t\t3 删除房源");
            System.out.println("\t\t\t4 修改房源信息");
            System.out.println("\t\t\t5 房源列表");
            System.out.println("\t\t\t6 退   出");
            System.out.print("请输入你的选择(1-6): ");
            key = Utility.readChar();
            switch (key) {
                case '1':

                    break;
                case '2':

                    break;
                case '3':

                    break;
                case '4':

                    break;
                case '5':

                    break;
                case '6':

                    break;
            }
        } while (loop);
    }

    

}