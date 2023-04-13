package com.tomoncle.designpattern.proxy.statics;

/**
 * @author tomoncle
 */
public class User implements UserService {
    public String sayHi() {
        System.out.println(this.getClass().getName()+"@sayHi");
        return "hello world";
    }
}
