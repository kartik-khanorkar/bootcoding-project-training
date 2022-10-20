package com.online.restaurant.utils;

import java.util.Random;

public class NameGenerator {
    private static String[] names = {"Kartik","Prajwal","Pratik","Swaraj","Ram","Sandesh","Nikhil",
    "Gourav","Tanay","Harsh"};
    public static String getnames(){
        Random random = new Random();
        int randomIndex = random.nextInt(names.length);
        String name = names[randomIndex];
        System.out.println("Name = " + name);
        return name;
    }

    public static void main(String[] args) {
        NameGenerator.getnames();
    }

}
