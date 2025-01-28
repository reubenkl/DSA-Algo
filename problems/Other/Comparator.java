package Other;

import java.util.function.Function;

@FunctionalInterface
public interface Comparator<T> extends java.util.Comparator<T>{

    public int compare(T t1, T t2);

    public default Comparator<T> thenComparing(Comparator<T> cmp){
        return (p1, p2) -> compare(p1, p2) == 0 ? cmp.compare(p1, p2) : compare(p1, p2);
    }

    public default Comparator<T> myThenComparing(Function<T, Comparable> f){
        return thenComparing(comparing(f));
    }

    /*
        Complex and flexible version of this method is below this method
        But in this method you can't direct pass Function<Person, Integer> in comparing method's argument because
        Function<Person, Integer> cannot be understood as Function<Person, Comparable> in java
        ex: you should call - Comparator<Person> cmpPersonAge = Comparator.comparing(Person::getAge());
     */
    public static <U> Comparator<U> comparing(Function<U, Comparable> f){
        return (p1, p2) -> f.apply(p1).compareTo(f.apply(p2));
    }

    /* Easy version of this method is above this method
       Here you can call
       Function<Person, Integer> f1 = p -> p.getAge(); or Function<Person, Integer> f1 = Person::getAge();
       ex: you should call - Comparator<Person> cmpPersonAge = Comparator.comparing(f1);

       public static <T, U extends Comparable<? super U>> Comparator<T> comparing(Function<? super T, ? extends U> f){
        return (p1, p2) -> f.apply(p1).compareTo(f.apply(p2));
       }
     */

}