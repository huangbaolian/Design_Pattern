package com.Pattern.proxy.staticDemo2;

public class UserServiceImpl implements  UserService{
    @Override
    public void add() {
        System.out.println("增加一个用户");
    }

    @Override
    public void delete() {
        System.out.println("删除一个用户");
    }

    @Override
    public void update() {
        System.out.println("更新一个用户");
    }

    @Override
    public void select() {
        System.out.println("查询一个用户");
    }
}
