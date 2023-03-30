package com.m2p;

import org.example.Architect;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;


public class ArchitectTest {
    @Test
    void checkIfOneCmIsOneCm(){
        //arrange
        Architect architect = new Architect(1,"cm");
        Boolean expectedAnswer = true;

        //act
        Boolean actualAnswer = architect.checkLength(1,"cm");

        //assert
        assertThat(expectedAnswer, is(equalTo(actualAnswer)));
    }
}
