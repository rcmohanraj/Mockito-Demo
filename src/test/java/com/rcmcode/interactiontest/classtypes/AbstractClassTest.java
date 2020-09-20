package com.rcmcode.interactiontest.classtypes;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class AbstractClassTest {

    @Test
    void testConcreteMethod() {
        AbstractClass abstractClassMock = Mockito.mock(AbstractClass.class);
        abstractClassMock.concreteMethod();
        Mockito.verify(abstractClassMock).concreteMethod();
        Mockito.when(abstractClassMock.abstractMethod()).thenReturn(10);
    }
}