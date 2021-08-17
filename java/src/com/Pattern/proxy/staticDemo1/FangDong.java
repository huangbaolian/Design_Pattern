package com.Pattern.proxy.staticDemo1;

public class FangDong implements Rent {
    @Override
    public void rent() {
        System.out.println("房东要出租房子！");
    }
}
