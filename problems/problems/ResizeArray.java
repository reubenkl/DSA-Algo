package problems;

import java.util.Arrays;

public class ResizeArray {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4};
        System.out.println("Before:"+ Arrays.toString(arr));
        arr = resize(arr, arr.length*2);
        System.out.println("Before:"+Arrays.toString(arr));
    }

    private static int[] resize(int[] arr, int capacity) {
        int[] temp = new int[capacity];
        for(int i=0; i<arr.length; i++){
            temp[i]=arr[i];
        }
        return temp;
    }
}
