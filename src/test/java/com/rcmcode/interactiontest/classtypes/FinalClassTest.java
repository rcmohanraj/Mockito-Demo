package com.rcmcode.interactiontest.classtypes;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

class FinalClassTest {

    @Mock
    private FinalClass finalClassMock;

    @InjectMocks
    private FinalClass finalClass;

    @BeforeEach
    void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testFinalClassFinalMethod() {
        //FinalClass finalClassMock = Mockito.mock(FinalClass.class);
        Mockito.when(finalClassMock.finalClassMethod()).thenReturn(10);

        //FinalClass finalClass = new FinalClass();
        MatcherAssert.assertThat(finalClassMock.finalClassMethod(), CoreMatchers.is(CoreMatchers.equalTo(finalClass.finalClassMethod())));
    }
}