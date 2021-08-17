package com.Pattern.proxy.reflectProxy2;

import com.Pattern.proxy.reflectProxy1.Rent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//用这个类，自动生产代理类
public class ProxyInvocationHandler implements InvocationHandler {
    //被代理的接口
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }


    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //动态代理的本质就是使用反射机制
        log(method.getName());
        Object invoke = method.invoke(target, args);

        return invoke;
    }

    public void log(String msg){
        System.out.println("执行了"+msg+"方法");
    }

}
