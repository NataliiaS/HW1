package org.sourceit.sydorenko.homework1;

public class Dog
{
    String name;
    String say;
    public static void main(String[] args){
        Dog Dog1 = new Dog();
        Dog Dog2 = new Dog();
        Dog1.name = "spot";
        Dog2.name = "scruffy";
        Dog1.say = "Ruff";
        Dog2.say = "Wurf";
        System.out.println("Dog1 name - " + (String)Dog1.name + ", say - " + (String)Dog1.say);
        System.out.println("Dog1 name - " + (String)Dog2.name + ", say - " + (String)Dog2.say);
    }
}
