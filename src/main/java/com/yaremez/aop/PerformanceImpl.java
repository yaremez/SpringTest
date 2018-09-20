package com.yaremez.aop;

import org.springframework.stereotype.Component;

@Component
public class PerformanceImpl implements Performance {
    @Override
    public void perform() {
        System.out.println("This is Performance implementation");
    }
}