package problems;

public class ZerosToRight {
    public static void main(String[] args) {
        int[] arr = {0,1,0,9,0,12,23,0,8,4,12};
        System.out.print("Before:");
        printArray(arr);
        arr = ShiftZerosToRight(arr);
        System.out.print("after:");
        printArray(arr);
    }

    private static int[] ShiftZerosToRight(int[] arr) {
        int zerothIndex = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0 && arr[zerothIndex]==0){
                int temp = arr[i];
                arr[i] = arr[zerothIndex];
                arr[zerothIndex] = temp;
            }
            if(arr[zerothIndex] != 0){
                zerothIndex++;
            }
        }
        return arr;
    }

    private static void printArray(int[] arr) {
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
}
