package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("The world depends on you! Tell me how many discs we're dealing with.");
        Scanner discInput = new Scanner(System.in);
        int discNum = discInput.nextInt();

        Hanoi discs = new Hanoi();
        discs.buildTower(discNum, 1, 2, 3);

    }
}
