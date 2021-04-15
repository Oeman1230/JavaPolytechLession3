package lession3;

import lession3.constants.constants;
import lession3.entity.Cat;
import lession3.entity.Dog;
import lession3.enums.Gender;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
    	Cat cat = new Cat();
	Dog dog = new Dog("Vasyan", 1, Gender.MALE);
	System.out.println(dog);

	System.out.println(constants.MESSAGE_NAME);
	dog.setAge(2);
	System.out.println(dog);
	dog.say("say bark");
	dog.sleep(1000);
	cat.say("say meow");
	cat.sleep(2000);
	List<AnimalActions> animalActionList = new ArrayList<>();
	animalActionList.add(dog);
	animalActionList.add(cat);
	animalActionList.forEach(it -> it.say("Say somth"));
    }
}
