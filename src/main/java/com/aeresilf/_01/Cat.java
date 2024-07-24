package com.aeresilf._01;

import java.util.Random;

public class Cat {
    private void sleep(){
        System.out.println("Sleep");
    }
    private void meow(){
        System.out.println("Meow");
    }
    private void eat(){
        System.out.println("Eat");
    }

    public void status(){
        Random rand = new Random();
        int mode = rand.nextInt(1,4);
        switch (mode){
            case 1: sleep(); break;
            case 2: meow(); break;
            case 3: eat(); break;
        }
    }
}
