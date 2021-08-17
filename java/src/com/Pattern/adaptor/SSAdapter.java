package com.Pattern.adaptor;

public class SSAdapter implements NetToUSB{
    private Adaptee adaptee;

    public SSAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void handleRequest() {
        adaptee.request();
    }
}
