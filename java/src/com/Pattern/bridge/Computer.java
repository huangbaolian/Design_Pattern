package com.Pattern.bridge;
//抽象的电脑类型类
public abstract class Computer {
    //组合,品牌~桥
    protected Brand brand;

    public Computer(Brand brand) {
        this.brand = brand;
    }

    public void info(){
        brand.info(); //自带品牌

    }
}
