package com.tomoncle.designpattern.observer;

/**
 * @author tomoncle
 */
public class Main {
    public static void main(String[] args) {
        EmailAlarmObserver email = new EmailAlarmObserver();
        MobileAlarmObserver mobile = new MobileAlarmObserver();
        AlertBackendSubject alertBackendSubject = new AlertBackendSubject(email, mobile);

        alertBackendSubject.sentData("hello world");

        System.out.println("\n\n");

        // 模拟新增一个观察者对象
        Observer<String> inner = new Observer<String>() {
            public void update(String s) {
                System.out.println("inner处理器正在处理告警信息 ...: " + s);
            }
        };
        // 注册
        alertBackendSubject.registerObserver(inner);
        // 触发
        alertBackendSubject.sentData("hello internet");
    }
}
