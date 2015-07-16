package org.sourceit.sydorenko.homework1;

import java.util.Scanner;

public class HW1Exercise8
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println((int)(Math.random() * (2*n + 1)) - n);
    }
}
