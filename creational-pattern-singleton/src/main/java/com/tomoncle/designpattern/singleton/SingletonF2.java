package com.tomoncle.designpattern.singleton;

/**
 * @author tomoncle
 */
public class SingletonF2 {
    //懒汉模式： 对getInstance()方法添加synchronized关键字保证线程安全， 使用时才创建，延迟加载
    //优点：延迟加载
    //缺点：每次调用都加锁同步执行，对象返回效率低，不推荐使用。
    private static SingletonF2 singletonF2;

    private SingletonF2(){}

    public static synchronized SingletonF2 getInstance() {
        if(null == singletonF2){
            singletonF2=new SingletonF2();
        }
        return singletonF2;
    }
}
