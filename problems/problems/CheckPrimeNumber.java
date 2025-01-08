package problems;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        boolean result = isPrime(33);
        System.out.println(result);
    }

    public static boolean isPrime(int num) {
        if(num<=1) return false;
        if(num == 2 || num == 3) return true;
        if(num%2 == 0 || num%3 == 0) return false;

        for(int i=5; i <= Math.sqrt(num); i+=6){
            if(num%i == 0 || num%(i+2) == 0) return false;
        }
        return true;
    }
}
