package models;

import java.util.ArrayList;

public class Hero {
    private int  age;
    private String name;
    private String powers;
    private String weakness;
    private static ArrayList<Hero>numberOfHeros = new ArrayList<>();


    public Hero(String name, String powers, String weakness, int age ) {
        this.name = name;
        this.age = age;
        this.powers = powers;
        this.weakness = weakness;
        numberOfHeros.add(this);

    }

    public static ArrayList<Hero> getAll() {
        return numberOfHeros;
    }

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getWeakness(){
        return this.weakness;
    }
    public String getPowers(){
        return this.powers;
    }
}
