package com.Pattern.proxy.reflectProxy1;

public class Client {
    public static void main(String[] args) {
        FangDong fangDong = new FangDong();
        //代理角色
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();
        proxyInvocationHandler.setRent(fangDong);
        Rent proxy = (Rent) proxyInvocationHandler.getProxy();
        proxy.rent();

    }
}
