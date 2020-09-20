package com.rcmcode.interactiontest.classtypes;

public interface MyInterface {

    void abstractMethod();

    default void defaultMethod() {
        System.out.println("Interface defaultMethod");
    }

    static int staticMethod() {
        System.out.println("Interface staticMethod");
        return 10;
    }
}
