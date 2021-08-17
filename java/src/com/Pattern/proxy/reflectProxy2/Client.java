package com.Pattern.proxy.reflectProxy2;

import com.Pattern.proxy.staticDemo2.UserService;
import com.Pattern.proxy.staticDemo2.UserServiceImpl;

public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        //代理角色
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setTarget(userService);//设置代理对象
        //动态生成代理类
        UserService proxy = (UserService) pih.getProxy();
        proxy.add();
        proxy.delete();

    }
}
