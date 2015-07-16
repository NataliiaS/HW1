package org.sourceit.sydorenko.homework1;

import java.util.Scanner;

public class HW1Exercise10
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Площадь треугольника = " + ((a*b)/2));
        System.out.println("Периметр треугольника = " + (a+b+Math.sqrt(a*a + b*b)));

    }
}
