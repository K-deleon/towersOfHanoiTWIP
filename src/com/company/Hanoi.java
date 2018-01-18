package com.company;

/**
 * Created by kd944 on 1/18/18.
 */
public class Hanoi {

    public int disc;

    public Hanoi(){

    }

    public void buildTower(int discNum, int start, int spare, int end){
        disc = discNum;
        if(discNum == 1){
            System.out.println("Disc " + (discNum) + " to peg " + end);
        } else{
            buildTower(discNum-1, start, end, spare);
            System.out.println("Disc " + (discNum) + " to peg " + end);
            buildTower(discNum-1, spare, start, end);
        }


    }



}
