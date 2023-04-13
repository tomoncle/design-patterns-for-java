package com.tomoncle.designpattern.observer;

/**
 * @author tomoncle
 */
public class EmailAlarmObserver implements Observer<String> {

    public void update(String alarmLog) {
        System.out.println("邮件处理器正在处理告警信息 ...: " + alarmLog);
    }
}
