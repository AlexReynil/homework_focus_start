package ru.cft;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoffeeTest {
    Coffee order1 = new Coffee(CoffeeType.Espresso, 7, 0);
    @Test
    void getType() {
        assertEquals(order1.getType(), CoffeeType.Espresso);
    }

    @Test
    void getBeans() {
      assertEquals(order1.getBeans(), CoffeeType.Espresso.getRequiredBeans());
    }

    @Test
    void getMilk() {
        assertEquals(order1.getMilk(), CoffeeType.Espresso.getRequiredMilk());
    }

    @Test
    void toString1() {
    }
}