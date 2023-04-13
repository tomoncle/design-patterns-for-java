package com.tomoncle.designpattern.builder;

/**
 * 抽象构建者,用于构建mobile
 * @author tomoncle
 */
public abstract class MobileBuilder {
    public abstract void buildName();
    public abstract void buildScree();
    public abstract void buildVersion();
    public abstract void buildCpu();
    public abstract void buildMemory();
    public abstract void buildOS();
    public abstract Mobile buildMobile();
}


