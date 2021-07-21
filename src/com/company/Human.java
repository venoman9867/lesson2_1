package com.company;

public class Human implements Jumpable,Runable {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public void jump() {
        System.out.println(name+" ,прыгнул");
    }

    @Override
    public void run() {
        System.out.println(name+" ,бежит");

    }
}
