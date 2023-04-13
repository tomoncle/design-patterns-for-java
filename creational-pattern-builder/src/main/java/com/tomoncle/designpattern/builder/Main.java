package com.tomoncle.designpattern.builder;

/**
 *
 * builder模式中的4个角色
 *
 *      Product:  要生成的产品对象
 *
 *      Builder： 构建者的抽象基类（有时会使用接口代替）定义了构建Product的抽象步骤，其子类要实现这些步骤。
 *
 *      xxxBuilder: 具体的构建者类
 *
 *      Director: 决定生产产品的步骤与顺序
 *
 * @author tomoncle
 */
public class Main {
    public static void main(String[] args) {
        MobileDirector director=new MobileDirector();

        MobileBuilder builder=new HuaWeiMobileBuilder();
        Mobile mobile = director.makeMobile(builder);
        System.out.println(mobile);

        builder=new MiMobileBuilder();
        mobile = director.makeMobile(builder);
        System.out.println(mobile);

    }
}
