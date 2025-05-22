package com.example.tests;

import com.example.Feline;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;



public class FelineTest {
    private Feline feline;

    @Before
    public void makeFeline() {
        feline = new Feline();
    }


    @Test
    public void eatMeatTest() throws Exception {
        List<String> result = List.of("Животные", "Птицы", "Рыба");
        assertEquals(result, feline.eatMeat());
    }
    @Test
    public void getFamilyTest() {
        String family = feline.getFamily();
        assertEquals("Кошачьи", family);
    }
    @Test
    public void getKittensNoConditionTest() {
        assertEquals(1, feline.getKittens());
    }
    @Test
    public void getKittensWithConditionsTest() {
        assertEquals(3, feline.getKittens(3));
    }
}
