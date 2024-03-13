package problems;

import java.math.BigInteger;

public class TrailingZerosInFactorial {
    public static void main(String[] args) {
        Integer input = 100;
        Integer result = trailingZerosCountInFactorialEfficientSolution(input);
        System.out.println(input+"! contains "+result+" trailing Zeros");
    }

    private static Integer trailingZerosCountInFactorialEfficientSolution(Integer input) {
        Integer result = 0;
        for(int i=5; i<=input; i=i*5){
            result = result+ input/i;
        }
        return result;
    }

    private static Integer trailingZerosCountInFactorial(Integer input) {
        BigInteger fact = new BigInteger("1");
        for(int i=2; i<=input; i++){
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        BigInteger factorial = fact;
        System.out.println("Factorial is "+factorial);
        Integer result = 0;
        while(fact.mod(BigInteger.TEN) == BigInteger.ZERO){
            result++;
            fact = fact.divide(BigInteger.TEN);
        }
        return result;
    }
}
