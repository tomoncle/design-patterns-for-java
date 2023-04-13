package com.tomoncle.designpattern.proxy.remote;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * 需要继承 remote 接口
 * @author tomoncle
 */
public interface UserService extends Remote {
    //注册远程调用的服务需要 throws RemoteException
    String sayHi(String name)throws RemoteException;
}
