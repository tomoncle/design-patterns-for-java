package com.tomoncle.designpattern.singleton;

/**
 * @author tomoncle
 */
public class SingletonF4 {

    // 静态内部类
    // 优点：静态内部类会延迟初始化
    // 缺点: 可以被反射破坏
    private SingletonF4() {
    }


    public static SingletonF4 getInstance() {
        return InnerClass.singleton;
    }

    private static class InnerClass {
        static final SingletonF4 singleton = new SingletonF4();
    }


}
