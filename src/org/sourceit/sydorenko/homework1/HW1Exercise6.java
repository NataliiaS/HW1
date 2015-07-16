package org.sourceit.sydorenko.homework1;

import java.util.Scanner;

public class HW1Exercise6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n%2==0){
            System.out.println("Число " + n + " четное");
        }
        else {
            System.out.println("Число " + n + " нечетное");
        }
    }
}
