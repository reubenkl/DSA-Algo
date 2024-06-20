package problems;

public class LCM {
    public static void main(String[] args) {
        Integer num1 = 15;
        Integer num2 = 12;

        Integer result = findLCM1(num1, num2);

        System.out.println("the LCM is:"+result);
    }

    private static Integer findLCM1(Integer num1, Integer num2) {
        Integer maxOfTwo = Math.max(num1, num2);
        return 0;
    }
}
