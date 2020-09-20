package com.rcmcode.interactiontest.classtypes;

public class ConcreteClass {

    void instanceMethod() {
        System.out.println("Instance Method");
    }

    final void finalMethod() {
        System.out.println("Final Method");
    }

    static String staticMethod() {
        System.out.println("Static Method");
        return "StaticMethodCalled";
    }

    private void privateMethod() {
        System.out.println("Private Method");
    }
}
