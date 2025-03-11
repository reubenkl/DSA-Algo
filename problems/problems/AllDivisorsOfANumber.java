package problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class AllDivisorsOfANumber {
    public static void main(String[] args) {
        getAllDivisors(100);
    }

    private static void getAllDivisors(int n) {
        int i;
        for(i=1; i<Math.sqrt(n); i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
        for( ; i>=1; i--){
            if(n%i == 0){
                System.out.print(n/i+" ");
            }
        }
    }
}
