package Other.FunctionPkg;

public class MainPredicate {

    public static void main(String[] args) {

        Predicate<String> p1 = s -> s.length() < 10;
        Predicate<String> p2 = s -> s.length() > 5;

        System.out.println("Reuben is LT10? - " + p1.test("Reuben"));
        System.out.println("Tux is GT5? - " + p2.test("Tux"));

        //Now we can chain the predicates with default methods by giving implementation
        Predicate<String> p3 = p1.and(p2);
        System.out.println("Zebb is LT10GT5? - " + p3.test("Zebb"));
        System.out.println("Morning is LT10GT5? - " + p3.test("Morning"));
        System.out.println("Good Morning is LT10GT5? - " + p3.test("Good Morning"));

        //Similarly with 'or' logic
        Predicate<String> p4 = p1.or(p2);
        System.out.println("Zebb is LT10GT5? - " + p4.test("Zebb"));
        System.out.println("Morning is LT10GT5? - " + p4.test("Morning"));
        System.out.println("Good Morning is LT10GT5? - " + p4.test("Good Morning"));

        //Implementing static method
        Predicate<String> p5 = Predicate.isEqualTo("Reuben");
        System.out.println(p5.test("Reuben"));

        Predicate<Integer> p6 = Predicate.isEqualTo(10);
        System.out.println(p6.test(1));
    }
}
