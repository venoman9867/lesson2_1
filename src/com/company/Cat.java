package com.company;

public class Cat implements Jumpable,Runable{
    private String name;

    public Cat(String name) {
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
