package ocpjp6.practice.study_guide.examples.collections.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: sathih
 * Date: 9/8/14
 * Time: 2:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class MapTest {

    public static void main(String[] args) {
        Map<Object, Object> objectMap = new HashMap<Object, Object>();
        objectMap.put("k1",new Dog("aiko"));
        objectMap.put("k2",Pets.DOG);
        objectMap.put(Pets.CAT,"CAT Key");
        Dog d1 = new Dog("clover");
        objectMap.put(d1,"DogKey");
        objectMap.put(new Cat(), "cat key");
        System.out.println(objectMap.get("k1"));
        String k2 = "k2";
        System.out.println(objectMap.get(k2));
        Pets p = Pets.CAT;
        System.out.println(objectMap.get(p));
        System.out.println(objectMap.get(d1));
        System.out.println(objectMap.get(new Cat()));
        System.out.println(objectMap.size());
    }
}

class  Cat{}

enum Pets{DOG, CAT, HORSE}


class Dog{
    public String name;
    public Dog(String name){
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog)) return false;

        Dog dog = (Dog) o;

        if (!name.equals(dog.name)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}