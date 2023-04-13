package com.tomoncle.designpattern.proxy.cglib;

/**
 * @author tomoncle
 */
public class Main {
    public static void main(String[] args) {
        CglibProxy cglibProxy=new CglibProxy(new User());
        User user = (User)cglibProxy.getProxyInstance();
        System.out.println(user.sayHi());
    }
}
