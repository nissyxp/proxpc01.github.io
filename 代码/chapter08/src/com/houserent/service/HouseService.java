package com.houserent.service;

import com.houserent.domain.House;//引入数据层的House类，对其进行逻辑操作，放在Service层中

/**
 * description:
 * author: 熊万里
 */
public class HouseService {
    private House[] houses;

    public HouseService(int size) {
        houses = new House[size];
        houses[0] =new House(1,"jack","112", "海淀区", 2000, "未出租");
    }

}
