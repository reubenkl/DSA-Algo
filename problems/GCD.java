package problems;

public class GCD {
    public static void main(String[] args) {
        Integer num1 = 15;
        Integer num2 = 12;

        Integer result = findGCD3(num1, num2);

        System.out.println("the GCD is:"+result);
    }

    private static Integer findGCD3(Integer num1, Integer num2) {
        if(num2 == 0){
            return num1;
        }
        return findGCD3(num2, num1%num2);
    }
    private static Integer findGCD2(Integer num1, Integer num2) {
        while(num1!=num2){
            if(num1 > num2){
                num1 = num1-num2;
            }else{
                num2 = num2-num1;
            }
        }
        return num1;
    }
    private static Integer findGCD1(Integer num1, Integer num2) {
        Integer minOfTwo = Math.min(num1, num2);
        Integer gcd = minOfTwo;
        while(gcd >0){
            if(num1%gcd==0 && num2%gcd==0){
                break;
            }
            gcd--;
        }
        return gcd;
    }
}
