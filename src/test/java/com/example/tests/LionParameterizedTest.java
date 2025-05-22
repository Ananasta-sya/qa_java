package com.example.tests;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParameterizedTest {
    @Mock
    private Feline feline;
    private Lion lion;

    private String sex;
    private boolean hasMane;

    public LionParameterizedTest(String sex, boolean hasMane) {
        this.sex=sex;
        this.hasMane=hasMane;
    }

    @Parameterized.Parameters
    public static Object[] makeLion() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }
@Test
    public void hasManeTest() throws Exception{
        lion = new Lion(sex, feline);
        boolean result = lion.doesHaveMane();
        assertEquals(hasMane, result);
}

}
