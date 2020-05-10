package com.company;

/*

2113 Hippodrome 12
There is very little left to add to the Horse class.
Each move the horse will call the move method.
When the move method is called on the horse, the horse must run some distance.
The distance depends on the speed of the horse (speed). In its simplest version, this method should look something like this:
distance + = speed;
But to make it more interesting, let's make the speed change a little bit all the time.
To do this, multiply speed by a random number.
A random number can be obtained using the Math.random () method.

Requirements:
1. In the move method of the Horse class, the value of the distance field must increase by the distance traveled in one "move"
(the value of the speed field) multiplied by a random number from zero to one obtained by calling the Math.random () method.


 */

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    public static Hippodrome game;
    private List<Horse> horses;

    public List<Horse> getHorses() {
        return this.horses;
    }

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public static void main(String[] args) {
        Horse horse1 = new Horse("me", 3, 0);
        Horse horse2 = new Horse("myself", 3, 0);
        Horse horse3 = new Horse("i", 3, 0);
        List<Horse> horses = new ArrayList<Horse>();
        horses.add(horse1);
        horses.add(horse2);
        horses.add(horse3);
        game = new Hippodrome(horses);
        // hyppodrome 11
        game.run();
        }

        public void move() {
        horses.forEach(Horse::move);
        }

        public void print() {
        for (Horse horse : this.horses) {
            horse.print();
        }
        for (int i=0; i<10; i++) {
            System.out.println();
        }
        }
        
        public void run() {
        for (int i=0; i<100; i++) {
            this.move();
            this.print();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        }
}

