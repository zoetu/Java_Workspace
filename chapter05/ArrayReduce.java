package chapter05;

import java.util.Scanner;

public class ArrayReduce {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};

        do{
            int[] arrNew = new int[arr.length-1];
            for(int i =0;i<arrNew.length;i++){
                arrNew[i]=arr[i];
            }
            arr = arrNew;
            for(int i =0;i<arrNew.length;i++){
                System.out.print(arr[i]+"\t");
            }
            System.out.println("\n"+"继续缩减元素？y/n");
            char key = myScanner.next().charAt(0);
            if(key == 'n'){
                break;
            }
            if(arr.length == 1){
                System.out.println("数组元素为1，不可以再缩减!");
                break;
            }
        }while(true);
    }
}
