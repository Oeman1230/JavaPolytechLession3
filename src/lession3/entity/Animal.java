package lession3.entity;

import lession3.AnimalActions;
import lession3.enums.Gender;

public abstract class Animal implements AnimalActions {

    protected String name;
    protected Integer age;
    protected Gender gender;
    public String test()
    {
        return name;
    }
}
