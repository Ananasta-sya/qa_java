package com.example.tests;

import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;

import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    private Feline feline;
    private Lion lion;

    @Before
    public void makeLion() throws Exception{
        lion = new Lion("Самец", feline);
    }
    @Test
    public void getKittensTest() throws Exception {
        Mockito.when(feline.getKittens()).thenReturn(1);
        assertEquals(1, lion.getKittens());
    }
    @Test
    public void getFoodTest() throws Exception{
        List <String> meal = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(meal);
        assertEquals(meal, lion.getFood());
        Mockito.verify(feline, Mockito.times(1)).eatMeat();

    }
    @Test(expected = Exception.class)
    public void invalidSexTest() throws Exception {
        new Lion("Они", this.feline);
    }
}
