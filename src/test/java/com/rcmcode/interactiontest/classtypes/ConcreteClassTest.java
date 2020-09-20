package com.rcmcode.interactiontest.classtypes;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

class ConcreteClassTest {

    @Mock
    private ConcreteClass concreteClassMock;

    @BeforeEach
    void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testFinalMethod() {
        concreteClassMock.finalMethod();
        Mockito.verify(concreteClassMock).finalMethod();
    }

    @Test
    void testInstanceMethod() {
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