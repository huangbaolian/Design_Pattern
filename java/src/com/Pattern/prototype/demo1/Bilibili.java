package com.Pattern.prototype.demo1;

import java.util.Date;

/**
 * 客户端，克隆
 *
 * 改变成为深克隆：1.序列化和反序列化；2.改造克隆方法
 *
 * Spring Bean:单例模式，原型模式
 * 与i那些模式+工厂模式-===》new 创建工厂<==>原型模式 clone
 */
public class Bilibili {
    public static void main(String[] args) throws CloneNotSupportedException {
        //原型对象
        Date date = new Date();
        Video video1 = new Video("原型对象",date);
        //V1克隆V2
        Video video2 = (Video) video1.clone();
        System.out.println("V1=>"+video1);
        System.out.println("V2=>"+video2);

        System.out.println("V1 hash=>"+video1.hashCode());
        System.out.println("V2 hash=>"+video2.hashCode());
        System.out.println("=====================浅克隆");
        date.setTime(2231111);
        System.out.println("V1=>"+video1);
        System.out.println("V2=>"+video2);
        System.out.println("=====================");
        video2.setName("盗版的");
        System.out.println(video2);
    }


}
