package com.tomoncle.designpattern.proxy.remote;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * @author tomoncle
 */
public class Server {
    public static void main(String[] args){
        try {
            LocateRegistry.createRegistry(9090);
            //并将远程对象注册到RMI注册表中
            // 绑定的URL标准格式为：rmi://host:port/name(其中协议名可以省略）
            Naming.bind("rmi://127.0.0.1:9090/user-service", new UserServiceImpl());
            System.out.println("start server success!");
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (AlreadyBoundException e) {
            e.printStackTrace();
        }

    }
}
