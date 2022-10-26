package com.SnakeLadder;

import java.util.Random;

public class UCTwo {
    public static void main(String[] args) {
        int position=0;
        System.out.println("Single player at start Position" +position);
        RollDice();
    }

    public static void RollDice() {
        Random random=new Random();
        int dice;
        dice = random.nextInt(6);
        dice=dice+1;
        System.out.println("Dice NUm:"+dice);
    }
}
