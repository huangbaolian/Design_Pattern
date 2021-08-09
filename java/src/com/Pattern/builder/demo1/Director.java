package com.Pattern.builder.demo1;

//指挥，负责指挥构建一个工程，如何构建，由他决定
public class Director {
    //指挥工人按照顺序建房子
    public Product build(Builder builder){
        builder.buildA();
        builder.buildB();
        builder.buildC();
        builder.buildD();
        return builder.getProduct();
    }
}
