package com.tomoncle.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 告警后端，具体的主题。
 * @author tomoncle
 */
public class AlertBackendSubject implements Subject<String> {
    private static List<Observer<String>> Observers;
    // 此处仅为示例，存在线程安全问题
    private String value;


    public AlertBackendSubject(final EmailAlarmObserver email, final MobileAlarmObserver mobile) {
        Observers = new ArrayList<Observer<String>>() {{
            add(email);
            add(mobile);
        }};
    }

    public void removeObserver(Observer observer) {
        if (Observers.contains(observer))
            Observers.remove(observer);
    }

    public void registerObserver(Observer<String> observer) {
        if (!Observers.contains(observer))
            Observers.add(observer);
    }

    public void notifyObserver() {
        for (Observer<String> Observer : Observers) {
            Observer.update(value);
        }
    }

    /**
     * 触发，设置告警数据
     * @param val 数据
     */
    public void sentData(String val) {
        value = val;
        notifyObserver();
    }

}

