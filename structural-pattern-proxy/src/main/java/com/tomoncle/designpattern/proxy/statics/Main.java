package com.tomoncle.designpattern.proxy.statics;

/**
 * @author tomoncle
 */
public class Main {
    public static void main(String[] args) {
        StaticProxy staticProxy = new StaticProxy(new User());
        System.out.println(staticProxy.sayHi());
    }
}
