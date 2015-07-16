package org.sourceit.sydorenko.homework1;

import java.util.Scanner;

public class HW1Exercise1
{
    public static void main(String[] args)
    {
        int a=0,sum=0;
        Scanner num = new Scanner(System.in);
        if(num.hasNextInt())a=num.nextInt();
        while(a>=1)
        {
            sum = sum + a%10;
            a = a/10;
        }
        System.out.println(sum);
        System.out.println("dgdgdgg");
    }
}



