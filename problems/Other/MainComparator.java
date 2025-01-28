package Other;

import java.util.Arrays;
import java.util.function.Function;

public class MainComparator {

    public static void main(String[] args) {

        //General way of implementing comparator using lambda expression
        Comparator<Person> cmpAge =  (p1, p2) -> p1.getAge() - p2.getAge();
        Comparator<Person> cmpFirstName = (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName());
        Comparator<Person> cmpLastName = (p1, p2) -> p1.getLastName().compareTo(p2.getLastName());


        //We can even have a function to return age,firstName and lastName in the lambda expression in above comparator
        Function<Person, Integer> f1 = Person::getAge;
        Function<Person, String> f2 = Person::getFirstName;
        Function<Person, String> f3 = Person::getLastName;

        /*
            So here instead of using the interface's method we can write another static method -comparing-
            and pass the function as an argument
        */
        Comparator<Person> cmpPersonAge = Comparator.comparing(Person::getAge);
        Comparator<Person> cmpPersonFirstName = Comparator.comparing(Person::getFirstName);
        Comparator<Person> cmpPersonLastName = Comparator.comparing(Person::getLastName);


        /*
            Going one step ahead
            we can even go one step ahead and chain the comparators
         */
        Comparator<Person> cmpPersonAgeFirstName = Comparator.comparing(Person::getAge)
                                                             .thenComparing(cmpPersonFirstName);


        /*
            Going one step ahead
            what if we use Functional argument for thenComparing method
         */
        Comparator<Person> cmpPerson = Comparator.comparing(Person::getAge)
                                                 .myThenComparing(Person::getFirstName)
                                                 .myThenComparing(Person::getLastName);



        Person[] names = new Person[] {
                new Person("Alice","Zoy",23),
                new Person("Reuben","Frankenstein",25),
                new Person("Reuben","Albert",25),
                new Person("Son","Tun",23),
                new Person("Ab","Az",21),
                new Person("Ab","Za",20)
        };

        Arrays.stream(names).sorted(cmpPerson).forEach(System.out::println);
    }
}
