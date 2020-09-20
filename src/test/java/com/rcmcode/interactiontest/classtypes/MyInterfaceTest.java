package com.rcmcode.interactiontest.classtypes;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class MyInterfaceTest {

    @Test
    void testDefaultMethod() {
        MyInterface myInterface = Mockito.mock(MyInterface.class);
        myInterface.abstractMethod();
        myInterface.defaultMethod();
        MyInterface.staticMethod();
        Mockito.verify(myInterface).abstractMethod();
        Mockito.verify(myInterface).defaultMethod();
    }
}