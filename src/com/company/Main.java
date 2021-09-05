package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss() {
            @Override
            public String name() {
                return "Boss";
            }
        };System.out.println(boss.name());
        Mental mental = new Mental() {
            @Override
            public String name() {
                return "Mental";
            }
        };System.out.println(mental.name());
        Magical magical = new Magical() {
            @Override
            public String name() {
                return "Magical";
            }
        };System.out.println(magical.name());
        Warrior warrior = new Warrior() {
            @Override
            public String name() {
                return "Warrior";
            }
        };System.out.println(warrior.name());


    }
}