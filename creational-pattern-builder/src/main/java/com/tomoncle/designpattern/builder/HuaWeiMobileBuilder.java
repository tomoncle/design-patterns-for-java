package com.tomoncle.designpattern.builder;

/**
 * 具体构建者
 * @author tomoncle
 */
public class HuaWeiMobileBuilder extends MobileBuilder{

    private Mobile mobile;

    public HuaWeiMobileBuilder() {
        this.mobile = new Mobile();
    }

    public void buildName() {
        this.mobile.setName("Mate40");
    }

    public void buildScree() {
        this.mobile.setScreen(SCREEN.curved);
    }

    public void buildVersion() {
        this.mobile.setVersion("1.0");
    }

    public void buildCpu() {
        this.mobile.setCpu(8);
    }

    public void buildMemory() {
        this.mobile.setCpu(256);
    }

    public void buildOS() {
        this.mobile.setOs("harmony");
    }

    public Mobile buildMobile() {
        return this.mobile;
    }
}
