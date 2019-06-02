package ru.cft;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CafeTest {
    private Cafe cafe;
    Coffee order1 = new Coffee(CoffeeType.Espresso, 7, 0);
    Coffee order2 = new Coffee(CoffeeType.Latte, 7, 227);
    private int beansInStock = 60;
    private int MilkInStock = 60;
    private int weightInGrams = 10;
    @Test
    void brew() {
    }

    @Test
    void EnoughBeansInStock() {
        assertTrue(beansInStock>order1.getBeans());
    }
    @Test
    void EnoughMilkInStock() {
        assertTrue(MilkInStock>order1.getMilk());
    }

    @Test
    void checkClass() {
        assertThat(order1).hasSameClassAs(order2);
    }
    @Test
    void restockBeans() {
        assertTrue(beansInStock+weightInGrams > beansInStock);

    }
    @Test
    void restockMilk() {
        assertTrue(MilkInStock+weightInGrams > MilkInStock);
    }

    @Test
    void getBeansInStock() {

    }

    @Test
    void getMilkInStock() {

    }
}