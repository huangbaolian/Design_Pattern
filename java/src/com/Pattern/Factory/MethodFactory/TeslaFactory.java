package com.Pattern.Factory.MethodFactory;

public class TeslaFactory implements CarFactory{

    @Override
    public Car getCar() {
        return new Tesla();
    }
}
