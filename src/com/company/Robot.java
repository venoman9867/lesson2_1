package com.company;

public class Robot implements Runable,Jumpable{
    private String name;

    public Robot(String name) {
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
