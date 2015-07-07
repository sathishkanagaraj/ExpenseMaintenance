package ocpjp6.practice.study_guide.examples.collections.list;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: sathih
 * Date: 9/8/14
 * Time: 1:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class ListTest {
    public static void main(String[] args) {
        Dog pomranian = new Dog("jimmy","pomranian",4);
        Dog rajapalayam = new Dog("johny","rajapalayam",6);
        Dog labrador = new Dog("tiger","labrador",5);
        List<Dog> dogs = new ArrayList<Dog>();
        dogs.add(pomranian);
        dogs.add(rajapalayam);
        dogs.add(labrador);
        dogs.add(3,new Dog("pinky","pomranian",2));
        for (Dog dog : dogs) {
            System.out.println("dogs = " + dog.getName());
        }
    }
}

class Dog {
    private String name;
    private String breed;
    private int age;

    Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    String getName() {
        return name;
    }

    String getBreed() {
        return breed;
    }

    int getAge() {
        return age;
    }
}
