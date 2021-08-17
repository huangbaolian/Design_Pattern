package com.Pattern.proxy.staticDemo1;

import javax.net.ssl.HostnameVerifier;

public class Client {
    public static void main(String[] args) {
        /*FangDong fangDong = new FangDong();
        fangDong.rent();*/

        FangDong fangDong = new FangDong();
        Proxy proxy = new Proxy(fangDong);
        proxy.rent();
        proxy.seeHouse();
        proxy.fare();

    }
}
