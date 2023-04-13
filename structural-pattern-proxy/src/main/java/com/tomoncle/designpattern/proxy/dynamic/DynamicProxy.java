package com.tomoncle.designpattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author tomoncle
 */
public class DynamicProxy {
    private Object target;

    public DynamicProxy(Object target) {
        this.target = target;
    }

    /**
     * 根据目标对象，返回代理对象
     *
     * @return 代理对象类型
     */
    public Object getProxyInstance() {
        /*
         * Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h)
         *
         * ClassLoader loader, 指定当前目标对象使用的类加载器，获取加载器的方法固定
         * Class<?>[] interfaces, 目标对象实现的接口类型，使用泛型方法确认类型
         * InvocationHandler h，事件处理，执行目标对象的方法时，会触发事件处理器方法，
         */
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("....... proxy start.........");
                        // 注意这里的入参为当前代理对象 target
                        Object value=method.invoke(target,args);
                        System.out.println("....... proxy end  .........");
                        return value;
                    }
                });
    }
}
