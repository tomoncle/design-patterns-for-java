package com.tomoncle.designpattern.observer;

/**
 * 抽象主题
 * @author tomoncle
 */
public interface Subject<T> {

    /**
     * 注册
     * @param observer 观察者对象
     */
    void registerObserver(Observer<T> observer);

    /**
     * 删除
     * @param observer 观察者对象
     */
    void removeObserver(Observer<T> observer);

    /**
     * 通知观察者
     */
    void notifyObserver();

}

