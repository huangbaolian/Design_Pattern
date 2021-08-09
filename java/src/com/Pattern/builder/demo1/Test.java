package com.Pattern.builder.demo1;

public class Test {
    public static void main(String[] args) {
        //指挥
        Director director = new Director();
        //指挥具体的工人完成产品
        Product build = director.build(new Worker());
        System.out.println(build.toString());
    }
}
