package problems;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = new int[] {2,4,1,8,6,3,7};
        int missedNumber = findMissingNumber(arr);
        System.out.println("Missed number is:"+missedNumber);
    }

    private static int findMissingNumber(int[] arr) {
        int length  = arr.length;
        int sum = ((length+1)*(length+2))/2;
        for(int i=0; i<length; i++){
            sum=sum-arr[i];
        }
        return sum;
    }
}
