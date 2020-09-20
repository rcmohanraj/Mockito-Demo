package com.rcmcode.interactiontest.classtypes;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class ConcreteClassTest {

    @Test
    void testFinalMethod() {
        ConcreteClass concreteClassMock = Mockito.mock(ConcreteClass.class);
        concreteClassMock.finalMethod();
        Mockito.verify(concreteClassMock).finalMethod();
    }

    @Test
    void testInstanceMethod() {
        ConcreteClass concreteClassMock = Mockito.mock(ConcreteClass.class);
        concreteClassMock.instanceMethod();
        Mockito.verify(concreteClassMock).instanceMethod();
    }

    @Test
    void testStaticMethod() {
        MockedStatic<ConcreteClass> mockedStatic = Mockito.mockStatic(ConcreteClass.class);
        mockedStatic.when(ConcreteClass :: staticMethod).thenReturn("StaticMethodCalled");
        MatcherAssert.assertThat(ConcreteClass.staticMethod(), CoreMatchers.equalTo("StaticMethodCalled"));
    }
}