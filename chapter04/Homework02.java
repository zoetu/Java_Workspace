package chapter04;

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);

        int n = myScanner.nextInt();

        if(n>0){
            System.out.println("大于0");
        }else if(n<0){
            System.out.println("小于0");
        }else{
            System.out.println("等于0");
        }
    }
}
