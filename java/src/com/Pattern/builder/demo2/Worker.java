package com.Pattern.builder.demo2;

public class Worker extends Builder{
    private  Product product;

    public Worker() {
        product = new Product();
    }

    @Override
    Builder buildA(String msg) {
        product.setBuilderA(msg);
        return this;
    }

    @Override
    Builder buildB(String msg) {
        product.setBuilderB(msg);
        return this;
    }

    @Override
    Builder buildC(String msg) {
        product.setBuilderC(msg);
        return this;
    }

    @Override
    Builder buildD(String msg) {
        product.setBuilderD(msg);
        return this;
    }

    @Override
    Product getProduct() {

        return product;
    }
}
