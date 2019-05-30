package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

abstract class Strategy {
    Map<String, String> dictionary = new HashMap<>();
    String answer;

    String translate(String word) {
        return null;
    }
    public Strategy() {
        dictionary.put("Привет","Hello");
        dictionary.put("Дерево","Tree");
        dictionary.put("Погода", "Weather");
        dictionary.put("Солнце", "Sun");
    }
}

class ConcreteStrategyRusENG extends Strategy {

    public String translate(String word) {
        if (!dictionary.containsKey(word)) {
            answer ="Такого слова в словаре нет";
        } else {
        answer = dictionary.get(word);
     }
        return answer;
    }
}

class ConcreteStrategyENGRUS extends  Strategy {

    public String translate(String word) {
        for (Map.Entry<String,String> e: dictionary.entrySet()){
            if (e.getValue().equals(word)) {
                answer = e.getKey();
            } else answer = "Такого слова в словаре нет";
        }
        return answer;
    }
}

class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy=strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public String executeTranslate(String word) {
        return strategy.translate(word);
    }
}

class StrategyExample {

    public static void main(String[] args) {
        Context context = new Context(new ConcreteStrategyRusENG());
        System.out.println("Введите строку для перевода. Режим: rus-eng");
                Scanner in = new Scanner(System.in);
                while (true) {
                String s = in.nextLine();
                if (s.equals("?rus-eng")) {
                context.setStrategy(new ConcreteStrategyRusENG());

                } else if (s.equals("?eng-rus")) {
                context.setStrategy(new ConcreteStrategyENGRUS());
                } else {
                String line = context.executeTranslate(s);
                System.out.println(line);
                }

                }
                }
                }