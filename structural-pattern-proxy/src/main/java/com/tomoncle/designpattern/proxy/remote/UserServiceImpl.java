package com.tomoncle.designpattern.proxy.remote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * UserServiceImpl 要继承 java.rmi.server.UnicastRemoteObject
 * @author tomoncle
 */
public class UserServiceImpl extends UnicastRemoteObject implements UserService {

    public UserServiceImpl() throws RemoteException {
    }

    public String sayHi(String name)  {
        return "hello " + name;
    }
}
