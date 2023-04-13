package com.tomoncle.designpattern.builder;

/**
 * 具体构建者
 * @author tomoncle
 */
public class MiMobileBuilder extends MobileBuilder{

    private Mobile mobile;

    public MiMobileBuilder() {
        this.mobile = new Mobile();
    }

    public void buildName() {
        this.mobile.setName("红米k40");
    }

    public void buildScree() {
        this.mobile.setScreen(SCREEN.surface);
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
        this.mobile.setOs("Android");
    }

    public Mobile buildMobile() {
        return this.mobile;
    }
}
