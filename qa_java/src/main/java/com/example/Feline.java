package com.example;

import java.util.Arrays;
import java.util.List;

public class Feline extends Animal implements Predator {

    @Override
    public List<String> eatMeat() throws Exception {
        return getFood("Хищник");
    }

    @Override
    public String getFamily() {
        return "Кошачьи";
    }

    public int getKittens() {
        return getKittens(1);
    }

    public int getKittens(int kittensCount) {
        return kittensCount;
    }

    public static class Alex extends Lion {

        public Alex() throws Exception {
            super("Самец", new Feline());
        }

        public List<String> getFriends() {
            return Arrays.asList("Марти", "Глория", "Мелман");
        }

        public String getPlaceOfLiving() {
            return "Нью-Йоркский зоопарк";
        }

        @Override
        public int getKittens() {
            return 0; // У Алекса нет львят
        }
    }
}
