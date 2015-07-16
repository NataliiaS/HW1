package org.sourceit.sydorenko.homework1;

import java.util.Scanner;

public class HW1Exercise9
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int ran = (int)(Math.random()*151)+5;
        if (25<ran && ran<100){
            System.out.println("Число " + ran + " попало в интервал (25;100)");
        }
        else {
            System.out.println("Число " + ran + " не попало в интервал (25;100)");
        }
    }
}
