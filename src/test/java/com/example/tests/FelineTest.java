package com.example.tests;

import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Spy
    private Feline feline;

    @Test
    public void eatMeatTest() throws Exception {
        feline.eatMeat();
        Mockito.verify(feline,Mockito.times(1)).getFood("Хищник");
    }
    @Test
    public void getFamilyTest() {
        String family = feline.getFamily();
        assertEquals("Кошачьи", family);
    }
    @Test
    public void getKittensNoConditionTest() {
        feline.getKittens();
        Mockito.verify(feline,Mockito.times(1)).getKittens(1);
    }
    @Test
    public void getKittensWithConditionsTest() {
        feline.getKittens(3);
        Mockito.verify(feline,Mockito.times(1)).getKittens(3);
    }
}
