package problems;

public class LCM {
    public static void main(String[] args) {
        Integer num1 = 2;
        Integer num2 = 8;

        Integer result = findLCM1(num1, num2);

        System.out.println("the LCM is:"+result);
    }

    private static Integer findLCM1(Integer num1, Integer num2) {
        return (num1*num2)/findGCD(num1,num2); // Eucledian formula (a*b) = gcd(a,b) * lcm(a,b)
    }

    private static Integer findGCD(Integer num1, Integer num2) {
        if(num2 == 0){
            return num1;
        }
        return findGCD(num2, num1%num2);
    }
}
