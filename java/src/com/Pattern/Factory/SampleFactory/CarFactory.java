package com.Pattern.Factory.SampleFactory;

public class CarFactory {
    public static Car getCar(String car){
        if (car.equals("wuling")){
            return new WuLing();
        }else if(car.equals("tesla")){
            return new Tesla();
        }else {
            return null;
        }
    }
}
