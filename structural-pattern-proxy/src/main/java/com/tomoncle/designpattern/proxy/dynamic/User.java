package com.tomoncle.designpattern.proxy.dynamic;


/**
 * @author tomoncle
 */
public class User implements UserService {
    public String sayHi() {
        System.out.println(this.getClass().getName()+"@sayHi");
        return "hello world for jdk";
    }
}
