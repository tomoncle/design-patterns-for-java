package com.tomoncle.designpattern.builder;


import lombok.Data;

/**
 * @author tomoncle
 */
@Data
public class Mobile {
    private String name;
    private String version;
    private SCREEN screen;
    private int cpu;
    private int memory;
    private String os;
}

enum SCREEN {
    curved, surface
}
