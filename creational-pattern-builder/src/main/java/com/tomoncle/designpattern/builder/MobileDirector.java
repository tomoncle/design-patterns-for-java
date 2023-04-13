package com.tomoncle.designpattern.builder;

/**
 * 指挥者 Director
 * @author tomoncle
 */
public class MobileDirector {

    public Mobile makeMobile(MobileBuilder mobileBuilder){
        mobileBuilder.buildName();
        mobileBuilder.buildCpu();
        mobileBuilder.buildMemory();
        mobileBuilder.buildOS();
        mobileBuilder.buildVersion();
        mobileBuilder.buildScree();
        mobileBuilder.buildMemory();
        return mobileBuilder.buildMobile();
    }

}
