package com.Pattern.Singelton;

//静态内部类实现单例---不安全的---反射
public class Holder {

    private Holder(){

    }
    public static Holder getInstance(){
        return InnerClass.holder;
    }
    public static  class  InnerClass{
        private static final Holder holder = new Holder();
    }
}
