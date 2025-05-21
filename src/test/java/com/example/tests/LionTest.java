package com.example.tests;

import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;

import org.mockito.junit.MockitoJUnitRunner;

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
        Mockito.when(feline.getKittens()).thenReturn(2);
        assertEquals(2, lion.getKittens());
    }
    @Test
    public void getFoodTest() throws Exception{
        lion.getFood();
        Mockito.verify(feline,Mockito.times(1)).getFood("Хищник");
    }
}
