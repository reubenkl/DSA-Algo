package problems;

public class PallindromeNumber {
    public static void main(String[] args) {
        Integer input = 8701078;
        Boolean pallindrome = checkPallindromeSolution2(input);
        System.out.println("Number "+input+" is pallindrome:"+ pallindrome);
    }

    private static Boolean checkPallindromeSolution2(Integer input) {
        Integer inputNumber = input;
        Integer reverse = 0;
        while(input > 0){
            reverse = reverse * 10 + (input%10);
            input = input/10;
        }
        return reverse.equals(inputNumber);
    }

    private static Boolean checkPallindromeSolution1(Integer input) {

        String inputNumber = String.valueOf(input);
        if(inputNumber.length() == 1){
            return true;
        }
        char[] inputArray = inputNumber.toCharArray();
        for(int i=0,j=inputArray.length-1; i<j; i++,j--){
            if(inputArray[i]==inputArray[j]){
                continue;
            }else{
                return false;
            }
        }

        return true;
    }
}
