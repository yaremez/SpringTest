package com.yaremez.aop;

@FunctionalInterface
public interface Performance {
    void perform();

    default void testDefault() {
        System.out.println("This is default method");
    }
}
