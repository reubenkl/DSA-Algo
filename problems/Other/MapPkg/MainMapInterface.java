package Other.MapPkg;

import Other.MapPkg.Person;

import java.util.*;

public class MainMapInterface {
    public static void main(String[] args) {
        Person p1 =  new Person("Alice",23);
        Person p2 = new Person("Reuben",15);
        Person p3 = new Person("Kelvin",25);
        Person p4 = new Person("Son",46);
        Person p5 = new Person("Aon",51);
        Person p6 = new Person("Clay",50);

        List<Person> list1 = new ArrayList<>(Arrays.asList(p1, p2, p3, p4, p5, p6));

//        System.out.println(list1);

        //using removeIf method by putting a boolean predicate
        Map<City, Person> map1 = new HashMap<>();
    }

}
