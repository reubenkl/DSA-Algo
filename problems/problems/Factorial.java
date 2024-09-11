package problems;

public class Factorial {
    public static void main(String[] args) {
        Integer input = 5;
        Integer result = recursiveFactorial(input);
        System.out.println(input+"! = "+result);
    }

    private static Integer recursiveFactorial(Integer input) {
        if(input == 0){
            return 1;
        }
        return input * recursiveFactorial(input-1);
    }
    private static Integer findFactorialSolution1(Integer input) {
        Integer result = 1;
        while(input>=1){
            result = result * input;
            input--;
        }
        return result;
    }
}
