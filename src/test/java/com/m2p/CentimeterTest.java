package com.m2p;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static com.m2p.Centimeter.createMeter;
import static com.m2p.Centimeter.createKiloMeter;
public class CentimeterTest {

    @Test
    void toCheckIfOneCmIsEqualToAnotherOneCm() {
        Centimeter oneCm = new Centimeter(1);
        Centimeter anotherOneCm = new Centimeter(1);

        assertThat(oneCm, is(equalTo(anotherOneCm)));
    }
    @Test
    void toCheckInequalityIfTwoCmIsEqualToAnotherOneCm() {
        Centimeter oneCm = new Centimeter(1);
        Centimeter twoCm = new Centimeter(2);

        assertThat(oneCm, is(not(equalTo(twoCm))));
    }

    @Test
    void toCheckIfOneMeterIsEqualToHundredCm(){

        Centimeter hundredCm = new Centimeter(100);
        Centimeter oneMeter = createMeter(1);

        assertThat(hundredCm, is(equalTo(oneMeter)));
    }
    @Test
    void toCheckInequalityIfTwoMeterIsEqualToHundredCm(){

        Centimeter hundredCm = new Centimeter(100);
        Centimeter oneMeter = createMeter(2);

        assertThat(hundredCm, is(not(equalTo(oneMeter))));
    }

    @Test
    void toCheckInequalityIfHundredCmIsEqualToPointOneKm(){
        Centimeter hundredCm = new Centimeter(100);
        Centimeter oneMeter = createKiloMeter(0.1);

        assertThat(hundredCm, is(not(equalTo(oneMeter))));

    }

    @Test
    void toCheckEqualityIfOneLakhCmIsEqualToPointOneKm(){
        Centimeter oneLakhCm = new Centimeter(100000);
        Centimeter oneMeter = createKiloMeter(0.1);

        assertThat(oneLakhCm, is(not(equalTo(oneMeter))));

    }

}


