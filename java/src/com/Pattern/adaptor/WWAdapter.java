package com.Pattern.adaptor;
//真正的适配器，连接USB，连接网线
//继承（类适配器，单继承）
//组合（对象适配器：常用）
public class WWAdapter extends Adaptee implements NetToUSB{
    @Override
    public void handleRequest() {
        super.request();//可以上网了
    }
}
