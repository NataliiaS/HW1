package org.sourceit.sydorenko.homework1;

public class HW1Exercise3
{
    public static void main(String[] args)
    {
        int a = 0;
        int b = 0;
        int happy = 0;
        for(int i=1; i<1000000;i++)
        {
            int suma = 0;
            int sumb = 0;
            a=(int)i/1000;
            b=i%1000;
            while(a>=1)
            {
                suma=suma+a%10;
                a=(int)a/10;
            }
            while(b>=1)
            {
                sumb=sumb+b%10;
                b=(int)b/10;
            }
            if(suma==sumb)happy++;
        }
        System.out.println(happy);
    }
}

