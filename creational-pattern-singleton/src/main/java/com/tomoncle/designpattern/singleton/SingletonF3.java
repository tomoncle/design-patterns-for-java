package com.tomoncle.designpattern.singleton;

/**
 * @author tomoncle
 */
public class SingletonF3 {

    //双重检测法：多次检测，最后一次再使用加锁创建
    // 优点：即保证了懒加载，又保证了高性能。
    // 缺点：相对复杂

    // volatile修饰保证了多个线程之间的可见性
    private static volatile SingletonF3 singletonF3;

    private SingletonF3() {
    }

    public static SingletonF3 getInstance() {
        if (null == singletonF3) {
            synchronized (SingletonF3.class) {
                if (null == singletonF3) {
                    singletonF3 = new SingletonF3();
                }
            }
        }
        return singletonF3;
    }
}
