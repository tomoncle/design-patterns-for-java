package com.tomoncle.designpattern.observer;

/**
 * @author tomoncle
 */
public class MobileAlarmObserver implements Observer<String> {

    public void update(String alarmLog) {
        System.out.println("短信处理器正在处理告警信息 ...: " + alarmLog);
    }


}