package problems;

public class CountDigits {
    public static void main(String[] args) {
        Integer input = 987877;
        Integer digitCount = CountNumberOfDigits(input);
        System.out.println("Total digits in "+input+" are "+digitCount);
    }

    private static Integer CountNumberOfDigits(Integer input) {
        Integer inputNumber = input;
        Integer digitCount = 0;
        while(inputNumber > 0){
            inputNumber = inputNumber/10;
            digitCount++;
        }
        return digitCount;
    }
}
