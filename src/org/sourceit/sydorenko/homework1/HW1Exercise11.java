package org.sourceit.sydorenko.homework1;

import java.util.Scanner;

public class HW1Exercise11
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextInt();
        float b = sc.nextInt();
        float c = sc.nextInt();
        float d = (b*b)-(4*a*c);
        if (d<0){
            System.out.println("корней нет");
        }
        else if (d==0)
        {
            double x1 = (-b)/(2*a);
            System.out.println("х = " + x1);
        }
        else
        {
            double x1 = (-b + Math.sqrt(d))/(2*a);
            double x2 = (-b - Math.sqrt(d))/(2*a);
            if (x1==x2)
            {
                System.out.println ("x1 = x2 " + x1);
            }
            else
            {
                System.out.println ("x1 =  " + x1 + "  x2 = " + x2);
            }
        }

    }
}
