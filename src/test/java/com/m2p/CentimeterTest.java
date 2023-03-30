package com.m2p;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class CentimeterTest {
     @Test
    void toCheckIfOneCmIsEqualToAnotherOneCm() {
        Centimeter oneCm = new Centimeter(1);
        Centimeter anotherOneCm = new Centimeter(1);

        assertThat(oneCm, is(equalTo(anotherOneCm)));
    }


}


