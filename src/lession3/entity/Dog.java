package lession3.entity;

import lession3.AnimalActions;
import lession3.enums.Gender;

/**
 * class dog
 * Описание объекта собаки
 * @return Новую собаку
 * @date 08.04.2021
 *
 * @author Yuri moskalev
 *
 */
public class Dog extends Animal {
    // public
    // private
    // protected


    @Override
    public void say(String message)
    {
        System.out.println("gaw gaw"+ message);
    }
    @Override
    public void sleep(Integer sleepMs)
    {
        System.out.println("Ya ne hochu spat");
    }

    public Dog(String name, Integer age, Gender gender)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public String getName(){
        return name;
    }

    public Integer getAge()
    {
        return age;
    }

    public Gender getGender()
    {
        return gender;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setAge(Integer age)
    {
        this.age = age;
    }
    public void setGender(Gender gender)
    {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
