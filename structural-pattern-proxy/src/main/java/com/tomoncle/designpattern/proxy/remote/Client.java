package com.tomoncle.designpattern.proxy.remote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * @author tomoncle
 */
public class Client {
    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
        // 使用JNDI服务找到远程对象
        UserService service = (UserService) Naming.lookup("rmi://127.0.0.1:9090/user-service");
        System.out.println(service.sayHi("tom"));
    }
}
