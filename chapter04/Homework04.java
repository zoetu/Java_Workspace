package chapter04;

import java.util.Scanner;

public class Homework04 {
    public static void main(String []args){
        Scanner myScanner = new Scanner(System.in);
        int num = myScanner.nextInt();

        int bai = 0;
        int shi = 0;
        int ge = 0;
        bai = num/100;
        shi = num%100/10;
        ge = num%10;

        int x = bai*bai*bai+shi*shi*shi+ge*ge*ge;
        if(num==x){
            System.out.println("水仙数="+num);
        }else{
            System.out.println("不是水仙花数");
        }
         
    }
}
