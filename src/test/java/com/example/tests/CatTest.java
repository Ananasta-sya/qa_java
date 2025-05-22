package com.example.tests;

import com.example.Cat;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    private Feline feline;
    private Cat cat;
    @Before
    public void makeCat() {
        cat = new Cat(feline);
    }

    @Test
    public void getSoundTest() {
        assertEquals("Мяу", cat.getSound());
    }
    @Test
    public void getFoodTest() throws Exception{
        cat.getFood();
        Mockito.verify(feline, Mockito.times(1)).eatMeat();
    }

}
