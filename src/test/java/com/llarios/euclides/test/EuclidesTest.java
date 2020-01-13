package com.llarios.euclides.test;


import com.llarios.euclides.Euclides;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EuclidesTest {


    @Test
    public void testFindTheEuclidesNumber(){

        final int answer = Euclides.findMCD(20, 12);

        Assertions.assertEquals(4,answer);
    }

    @Test
    public void testFindTheEuclidesNumber2(){

        final int answer = Euclides.findMCD(1032, 180);

        Assertions.assertEquals(12,answer);
    }
}
