package com.company;

/**
 * Created by kd944 on 1/18/18.
 */
public class Hanoi {

    public int discNum;

    public Hanoi(){

    }

    public void buildTower(int discNum, int start, int end){
        if(discNum == 1){
            System.out.println("Move disc " + (discNum) +  from peg " + start + " to peg " + end + ".");
        } else{
            int spare = 6 - (start + end);
            buildTower(discNum-1, start, end);
            System.out.println("Move disc " + (discNum) +  from peg " + start  + " to peg " + end + ".");
            start = spare;                   
            buildTower(discNum-1, start,end);
        }


    }



}
