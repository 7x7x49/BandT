package com.company;

public class Main{
    public static void main(String[] args){

        AnimalThread bunny = new AnimalThread("кролек", 10);
        bunny.start();                                                 //запуск потока

        AnimalThread turtle = new AnimalThread("туртл", 1);
        turtle.start();

    }
}