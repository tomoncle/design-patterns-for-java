package com.tomoncle.designpattern.proxy.statics;

/**
 * @author tomoncle
 */
public class StaticProxy implements UserService{

    // 目标对象，通过接口来聚合
    private UserService target;

    public StaticProxy(UserService target){
        this.target=target;
    }

    public String sayHi() {
        // TODO something
        System.out.println("....... proxy start.........");
        String hi = target.sayHi();
        System.out.println("....... proxy end  .........");
        return hi;
    }
}
