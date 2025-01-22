package problems;

import java.util.ArrayList;
import java.util.List;

public class SeiveOfEratosthenes {
    public static void main(String[] args) {
        int num = 25;
        getAllPrimeNumbers(num);
    }

    private static void getAllPrimeNumbers(int num) {
        boolean[] isPrime = new boolean[num+1];
        for(int i=2; i<=num; i++){
            isPrime[i] = true;
        }
        for(int i=2; i<=Math.sqrt(num); i++){
            if(isPrime[i]){
                for(int j=i*i; j<=num; j+=i){
                    isPrime[j] = false;
                }
            }
        }

        for(int i=2; i<=num;i++){
            if(isPrime[i]){
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }
}
