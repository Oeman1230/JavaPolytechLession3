package lession3.entity;

import lession3.AnimalActions;

public class Cat extends Animal {
    private String name;

@Override
    public void say(String message)
{
    System.out.println("meow"+ message);
}
@Override
    public void sleep(Integer sleepMs)
{
    System.out.println("Ne hochu");
}
}
