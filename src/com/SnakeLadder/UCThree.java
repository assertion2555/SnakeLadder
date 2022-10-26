package com.SnakeLadder;

import javax.swing.text.Position;
import java.util.Random;

public class UCThree {


    public static void main(String[] args) {
        int position=0;
        int dice=0;
        System.out.println("Single Player at start position"+ position);
        dice=rolldice();
        mapTo(dice,position);
    }
    public static int rolldice() {
        Random random=new Random();
        int dice= random.nextInt(6);
        dice =dice+1;
        System.out.println("Dice number:" + dice);
        return dice;
    }
    public static void mapTo(int dice, int position) {
    Random random=new Random();
    int map= random.nextInt(2);
    map=map+1;
        System.out.println("Maping method " +  map);
        switch (map) {
            case 1:
                System.out.println("No Play the player stays in the same position");
                break;
            case 2:
                position = position + dice;
                System.out.println("your position after ladder is " +  position);
                break;
            case 3:
                position = position - dice;
                System.out.println("your position after Sanke " +  position);
                break;


        }
    }
}
