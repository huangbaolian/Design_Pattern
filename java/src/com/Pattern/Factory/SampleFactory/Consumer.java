package com.Pattern.Factory.SampleFactory;

//违反开闭原则，对修改封闭
public class Consumer {
    public static void main(String[] args) {
        /*Car car = new WuLing();
        Car car1 = new Tesla();
        car.name();
        car1.name();*/
        //使用工厂方式
        Car car = CarFactory.getCar("wuling");
        car.name();
    }
}
