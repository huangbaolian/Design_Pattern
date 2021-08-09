package com.Pattern.Factory.AbstractFactory;

public class XiaoMiFactory implements ProductFactory{
    @Override
    public PhoneProduct phoneProduct() {
        return new XiaoMiPhone();
    }

    @Override
    public RouterProduct routerProduct() {
        return new XiaoMiRouter();
    }
}
