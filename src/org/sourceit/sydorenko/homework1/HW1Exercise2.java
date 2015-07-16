package org.sourceit.sydorenko.homework1;

public class HW1Exercise2
{
    public static void main(String[] args)
    {
        int a = 0, b = 1, c;
        for(int i = 0; i<11; i++)
        {
            if (i==0)
            {
                System.out.println(a);
            }
            else if (i==1)
            {
                System.out.println(b);
            }
            else if (i!=0 && i!=1)
            {
                c = b;
                b = a + b;
                a = c;
                System.out.println(b);
            }

        }
    }
}
