package com.tomoncle.designpattern.proxy.dynamic;

/**
 * @author tomoncle
 */
public class Main {
    public static void main(String[] args) {
        DynamicProxy dynamicProxy = new DynamicProxy(new User());
        UserService instance = (UserService)dynamicProxy.getProxyInstance();
        System.out.println(instance.sayHi());
    }
}
