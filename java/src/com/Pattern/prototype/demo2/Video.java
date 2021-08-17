package com.Pattern.prototype.demo2;

import java.util.Date;

/**原型模式
 * 1.实现一个接口Cloneable(native 的)
 * 2.重写一个方法
 */
//Video:视频的原型
public class Video implements Cloneable {
    private String name;
    private Date createTime;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object object = super.clone();
        Video v = (Video)object;
        //将这个对象的属性也进行克隆
        v.createTime= (Date) this.createTime.clone();
        return object;
    }

    public Video() {
    }

    public Video(String name, Date createTime) {
        this.name = name;
        this.createTime = createTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Video{" +
                "name='" + name + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
