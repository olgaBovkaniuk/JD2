package by.it.academy.maven.impl;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MathServiceTest {
    MathService mathService;

    @org.junit.Before
    public void setUp() throws Exception {
        mathService = new MathService();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        mathService = null;
    }

    @org.junit.Test
    public void average() {
        //given
        List<Integer> testData = List.of(1, 2);
        List<Integer> testData2 = new ArrayList<>();
        testData2.add(1);
        testData2.add(null);
        testData2.add(2);

        //when

        Double average = mathService.average(testData);
        Double average2 = mathService.average(testData2);

        //then
        assertEquals(1.5, average, 0);
        assertEquals(1.5, average, 0);
    }
}