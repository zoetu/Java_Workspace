package chapter05;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55,66};

        int[] arr1 = new int[6];

        for(int i =0;i<arr.length;i++){
            arr1[i] = arr[6-i-1];
        }


        for(int i =0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
    }
}
