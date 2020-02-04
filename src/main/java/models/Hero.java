package models;

public class Hero {
    int  age;
    String name;
    String powers;
    String weakness;

    public Hero(String name, String powers, String weakness, int age ) {
        this.name = name;
        this.age = age;
        this.powers = powers;
        this.weakness = weakness;

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
