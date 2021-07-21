package com.company;

public class Main {

    public static void main(String[] args) {
        String[] participant = new String[5];
        participant[0]="Вася";
        participant[1]="Мурка";
        participant[2]="Т-3000";
        participant[3]="Маруся";
        participant[4]="Петя";

        for (int i=0; i<participant.length;i++){
            participant[i].jump();
        }
        for (int i=0; i<participant.length;i++){
            participant[i].run();
        }
    }
}
