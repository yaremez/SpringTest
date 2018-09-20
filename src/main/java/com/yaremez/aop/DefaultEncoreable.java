package com.yaremez.aop;

public class DefaultEncoreable implements Encoreable {
    @Override
    public void performEncore() {
        System.out.println("Encoreable implementation");
    }
}
