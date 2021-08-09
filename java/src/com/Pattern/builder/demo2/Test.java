package com.Pattern.builder.demo2;

public class Test {
    public static void main(String[] args) {
        Worker worker = new Worker();
        //链式编程
        Product product = worker.buildA("AAA").buildC("CCC")
                        .getProduct();
        //Product product = worker.getProduct();

        System.out.println(product.toString());
    }
}
