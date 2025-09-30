package com.example;

import java.util.Arrays;
import java.util.List;

public class Alex extends Lion {

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