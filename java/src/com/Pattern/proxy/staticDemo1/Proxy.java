package com.Pattern.proxy.staticDemo1;

public class Proxy implements Rent{
    private FangDong fangDong;

    public Proxy() {
    }

    public Proxy(FangDong fangDong) {
        this.fangDong = fangDong;
    }

    @Override
    public void rent() {
        fangDong.rent();
    }

    //附加功能：看房
    public void seeHouse(){
        System.out.println("中介带你看房");
    }
    //收中介费
    public void fare(){
        System.out.println("收中介费");
    }

}
