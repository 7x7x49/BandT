package com.company;

public class AnimalThread extends Thread {

    public AnimalThread(String name, int priority){
        this.setName(name);
        this.setPriority(priority);
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i++ ){

            System.out.println(getName() + ": пробежал " + (i*100) + " метров");

            if(i == 6 && getName().equals("кролек")){      //число миллисекунд, на которое "уснёт" поток
                try {
                    sleep(1000);
                    System.out.println((char) 27 + "[35mкролик решил сойти с дистанции и отдохнуть" + (char)27 + "[0m");

                } catch (InterruptedException e) {
                    e.printStackTrace();
                    return;                                 //выход из метода тогда, когда поток прерывается
                }
            }
        }
    }
}
