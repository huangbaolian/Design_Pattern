package com.Pattern.Factory.AbstractFactory;

public class Client {
    public static void main(String[] args) {
        System.out.println("++++++++++小米系列+++++++++++");
        XiaoMiFactory xiaoMiFactory = new XiaoMiFactory();
        PhoneProduct phoneProduct = xiaoMiFactory.phoneProduct();
        phoneProduct.start();
        phoneProduct.shutdown();
        phoneProduct.callout();
        phoneProduct.sendSMS();
        RouterProduct routerProduct = xiaoMiFactory.routerProduct();
        routerProduct.openWifi();
        routerProduct.setting();
        routerProduct.start();
        routerProduct.shutdown();
    }
}
