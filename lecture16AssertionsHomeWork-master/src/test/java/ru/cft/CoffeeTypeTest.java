package ru.cft;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.Buffer;

import static org.assertj.core.api.Java6Assertions.assertThat;

import static org.junit.jupiter.api.Assertions.*;

class CoffeeTypeTest {
    String line;
    File file = new File("espr.txt");
    Coffee espr = new Coffee(CoffeeType.Espresso, 7, 0);
    Coffee latte = new Coffee(CoffeeType.Latte, 7,227);
    Coffee filter = new Coffee(CoffeeType.FilterCoffee, 10,10);
    @Test
    void getRequiredBeansForEspresso() {
        assertEquals(espr.getBeans(), CoffeeType.Espresso.getRequiredBeans());


    }
    @Test
    void fromFile()
    {

        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            BufferedReader br = new BufferedReader(new FileReader("espr.txt"));
            this.line = br.toString();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        assertEquals(line, espr);
    }

    @Test
    void getRequiredMilkForLatte() {
        assertEquals(latte.getMilk(), CoffeeType.Latte.getRequiredMilk());

    }
    @Test
    void getRequiredMilkForFilter() {
        assertEquals(CoffeeType.FilterCoffee.getRequiredMilk(), filter.getMilk()); // проверка, что есть ошибка
    }
}