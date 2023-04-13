package com.tomoncle.designpattern.proxy.cglib;


/**
 * @author tomoncle
 */
public class User {
    public String sayHi() {
        System.out.println(this.getClass().getName()+"@sayHi");
        return "hello world for cglib";
    }
}
