package com.tomoncle.designpattern.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author tomoncle
 */
public class CglibProxy implements MethodInterceptor {
    private Object target;

    public CglibProxy(Object target) {
        this.target = target;
    }

    /**
     * 使用Cglib，根据目标对象，返回代理对象
     *
     * @return 代理对象类型
     */
    public Object getProxyInstance() {
        // 创建工具类
        Enhancer enhancer = new Enhancer();
        // 设置父类
        enhancer.setSuperclass(target.getClass());
        // 设置回调函数
        enhancer.setCallback(this);
        // 创建子类，并返回
        return enhancer.create();
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("....... proxy start.........");
        // 注意这里的入参为当前代理对象 target
        Object value = method.invoke(target, objects);
        System.out.println("....... proxy end  .........");
        return value;
    }
}
