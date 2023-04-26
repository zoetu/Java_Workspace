package chapter04;
import java.util.Scanner;

import javax.swing.DefaultDesktopManager;

public class SwitchExercise {
    public static void main(String[] args){
        /*
         * 1) 使用 switch 把小写类型的 char 型转为大写(键盘输入)。
         * 只转换 a, b, c, d, e. 其它的输出 "other"。
         * 2) 对学生成绩大于 60 分的，输出"合格"。低于 60 分的，输出"不合格"。
         * (注：输入的成绩不能大于 100), 提示 成绩/60
         * 3) 根据用于指定月份，打印该月份所属的季节。
         * 3,4,5 春季 6,7,8 夏季 9,10,11 秋季 12, 1, 2 冬季 
         */

        // Scanner myScanner = new Scanner(System.in);
        // System.out.println("Input:");
        // char c2 = myScanner.next().charAt(0);       
        // switch(c2){
        //     case 'a':
        //         c2='A';
        //         System.out.println(c2);
        //         break;
        //     case 'b':
        //         c2='B';
        //         System.out.println(c2);
        //         break;
        //     case 'c':
        //         c2='C';
        //         System.out.println(c2);
        //         break;
        //     default:
        //         System.out.println("False");
        //         break;
        // }

        // double score = 1.1;
        // Scanner myScanner = new Scanner(System.in);
        // System.out.println("输入成绩：");
        // score = myScanner.nextDouble();
        // if(score>=0 && score<=100){
        //     switch((int)(score/60)){
        //         case 0:
        //             System.out.println("不合格");
        //             break;
        //         case 1:
        //             System.out.println("合格");
        //             break;
        //     }
        // }else{
        //     System.out.println("1-100以内的输入");
        // }

        int month = 0;
        System.out.println("输入月份：");
        Scanner myScanner = new Scanner(System.in);
        month = myScanner.nextInt();
        switch (month){
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10: 
            case 11:
                System.out.println("秋季");
                break;
            case 12:
            case 1: 
            case 2:
                System.out.println("冬季");
                break;
            default:
                System.out.println("输入月份不对，1-12");
        }    
    }
}
