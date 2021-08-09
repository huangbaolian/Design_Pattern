package com.Pattern.Singelton;

import java.lang.reflect.Constructor;

//枚举默认就是单例的
public enum EnumSingle {
    INSTANCE;
    public EnumSingle getInstance(){
        return INSTANCE;
    }

}

class Test{
    public static void main(String[] args) throws Exception {
        EnumSingle enumSingle = EnumSingle.INSTANCE;
        EnumSingle enumSingle2 = EnumSingle.INSTANCE;
        Constructor<EnumSingle> declaredConstructor = EnumSingle.class.getDeclaredConstructor(String.class,int.class);
        declaredConstructor.setAccessible(true);
        EnumSingle enumSingle1 = declaredConstructor.newInstance();
        System.out.println(enumSingle);
        System.out.println(enumSingle2);
        System.out.println(enumSingle1);
    }
}