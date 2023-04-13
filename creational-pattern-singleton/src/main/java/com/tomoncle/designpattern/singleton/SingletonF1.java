package com.tomoncle.designpattern.singleton;

/**
 * @author tomoncle
 */
public class SingletonF1 {

    //饿汉模式，提前初始化变量。
    //
    //优点：线程安全
    //缺点：占内存 以空间换时间

    private static final SingletonF1 singleton = new SingletonF1();

    private SingletonF1() {
    }

    public static SingletonF1 getInstance() {
        return singleton;
    }
}
