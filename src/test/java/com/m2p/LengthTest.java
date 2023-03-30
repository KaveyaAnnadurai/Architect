package com.m2p;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static com.m2p.Length.meter;
import static com.m2p.Length.kilometer;
import static com.m2p.Length.centimeter;
public class LengthTest {

    @Test
    void toCheckIfOneCmIsEqualToAnotherOneCm() {
        Length oneCm = centimeter(1);
        Length anotherOneCm = centimeter(1);

        assertThat(oneCm, is(equalTo(anotherOneCm)));
    }
    @Test
    void toCheckInequalityIfTwoCmIsEqualToAnotherOneCm() {

        Length oneCm = centimeter(1);
        Length twoCm = centimeter(2);

        assertThat(oneCm, is(not(equalTo(twoCm))));
    }

    @Test
    void toCheckIfOneMeterIsEqualToHundredCm(){

        Length hundredCm = centimeter(100);
        Length oneMeter = meter(1);

        assertThat(oneMeter, is(equalTo(hundredCm)));
    }
    @Test
    void toCheckInequalityIfTwoMeterIsEqualToHundredCm(){

        Length hundredCm = centimeter(100);
        Length oneMeter = meter(2);

        assertThat(hundredCm, is(not(equalTo(oneMeter))));
    }

    @Test
    void toCheckInequalityIfHundredCmIsEqualToPointOneKm(){
        Length hundredCm = centimeter(100);
        Length oneMeter = kilometer(0.1);

        assertThat(hundredCm, is(not(equalTo(oneMeter))));

    }

    @Test
    void toCheckEqualityIfOneLakhCmIsEqualToPointOneKm(){
        Length oneLakhCm = centimeter(100000);
        Length oneMeter = kilometer(0.1);

        assertThat(oneLakhCm, is(not(equalTo(oneMeter))));

    }


}


