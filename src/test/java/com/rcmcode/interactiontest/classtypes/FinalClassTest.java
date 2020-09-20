package com.rcmcode.interactiontest.classtypes;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class FinalClassTest {

    @Test
    void testFinalClassFinalMethod() {
        FinalClass mock = Mockito.mock(FinalClass.class);
        Mockito.when(mock.finalClassMethod()).thenReturn(10);

        FinalClass finalClass = new FinalClass();
        MatcherAssert.assertThat(mock.finalClassMethod(), CoreMatchers.is(CoreMatchers.equalTo(finalClass.finalClassMethod())));
    }
}