package chapter04;

import java.util.Scanner;

public class DoWhileExercise {
    public static void main(String[] args){
    // 1) 打印 1—100 [学生做] 
    int i = 1;
    do{
        System.out.println("i="+i);
        i++;
    }while(i<=100);
    // 2) 计算 1—100 的和 [学生做] 
    i = 0;
    int sum = 0;
    do{
        sum=sum+i;
        i++;
    }while(i<=100);
    System.out.println("sum="+sum);
    
    // 3) 统计 1---200 之间能被 5 整除但不能被 3 整除的个数
    int j = 0;
    int count = 0;
    do{
        if(j%5==0 && j%3!=0){
            count++;
        }
        j++;
    }while(j<=200);
    System.out.println("count="+count);

    // 4) 如果李三不还钱，则老韩将一直使出五连鞭，直到李三说还钱为止
    Scanner myScanner = new Scanner(System.in);
    char ans = ' ';
    do{
        System.out.println("还钱吗？输出y/n");
        ans = myScanner.next().charAt(0);
    }while(ans=='n');
    System.out.println("还了！");
}
}
