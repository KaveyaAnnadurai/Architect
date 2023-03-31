package com.m2p;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static com.m2p.Length.meter;
import static com.m2p.Length.kilometer;
import static com.m2p.Length.centimeter;

//Req 3: As an architect, I want to be able to know that 1 m + 100 cm = 2 m, or 200 cm + 1 km = 100200 cm
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

    @Test
    void toCheckIfSumOfOneMeterAndHundredCmIsTwoMeter(){
        Length oneMeter = meter(1);
        Length hundredCentimeter = centimeter(100);

        Length twoMeter = meter(2);
        assertThat(oneMeter.plus(hundredCentimeter), is(equalTo(twoMeter)));

    }
    @Test
    void toCheckInequalityIfSumOfOneMeterAndOneCmIsTwoMeter(){
        Length oneMeter = meter(1);
        Length oneCentimeter = centimeter(1);

        Length twoMeter = meter(2);
        assertThat(oneMeter.plus(oneCentimeter), is(not(equalTo(twoMeter))));

    }
    @Test
    void toCheckIfSumOfTwoHundredCmAndOneKmIsOneLakhTwoHundredCm(){
        Length twoHundredCm = centimeter(200);
        Length oneKm = kilometer(1);

        Length oneLakhHundredCm = centimeter(100200);

        assertThat(twoHundredCm.plus(oneKm), is(equalTo(oneLakhHundredCm)));
    }
    @Test
    void toCheckInequalityIfSumOfTwoCmAndOneKmIsTwoThousandCm(){
        Length twoCm = centimeter(2);
        Length oneKm = kilometer(1);

        Length twoThousandCm = centimeter(2000);

        assertThat(twoCm.plus(oneKm), is(not(equalTo(twoThousandCm))));
    }

}


