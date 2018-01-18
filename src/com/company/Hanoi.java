package com.company;

/**
 * Created by kd944 on 1/18/18.
 */
public class Hanoi {

    public int discNum;

    public Hanoi(){

    }

    public void buildTower(int discNum, int start, int spare, int end){
        if(discNum == 0){
            System.out.println("Move disc " + (discNum+1) + /*" from peg " + start +*/ " to peg " + end + ".");
        } else{
            buildTower(discNum-1, start, end, spare);
            System.out.println("Move disc " + (discNum) + " to peg " + end + ".");
            buildTower(discNum-1, spare, start,end);
        }


    }



}
