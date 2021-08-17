package com.Pattern.adaptor;

//客户端，想用网线
public class Computer {
    public void net(NetToUSB netToUSB){
        //上网的具体实现，找一个转接头
        netToUSB.handleRequest();
    }

    public static void main(String[] args) {
        //电脑，适配器，网线
        Computer computer = new Computer();
        Adaptee adaptee = new Adaptee();
        //WWAdapter adapter = new WWAdapter();
        SSAdapter adapter = new SSAdapter(adaptee);
        computer.net(adapter);
    }
}
