package chapter04;

import java.util.Scanner;

import javax.sound.midi.SysexMessage;
import javax.swing.ToolTipManager;

public class MulForExercise01 {
    public static void main(String[] args){
        // // 1) 统计 3 个班成绩情况，每个班有 5 名同学，
        // // 求出各个班的平均分和所有班级的平均分[学生的成绩从键盘输入]。
        // Scanner myScanner = new Scanner(System.in);
        // int studentNum = 5;
        // int classNum = 3;
        // // 2) 统计三个班及格人数，每个班有 5 名同学。
        // int passNum = 0 ;//累计及格人数
        // double score = 0.0;
        // double total_score = 0.0;
        // double sum_score = 0.0;
        // double avg_score = 0.0;
        // for(int c=1;c<=classNum;c++){
        //     sum_score = 0;
        //     for(int i =1;i<=studentNum;i++){
        //         System.out.println("Input "+i+"th"+" Student of "+c+"th Score:");
        //         score = myScanner.nextDouble();
        //         if(score>60){
        //             passNum++;
        //         }
        //         sum_score = sum_score + score;
        //     }
        //     avg_score = sum_score/studentNum;
        //     total_score = total_score+sum_score;
        //     System.out.println("avg_score="+avg_score);
        // }
        // System.out.println("及格人数="+passNum);
        // System.out.println("三个班总分="+total_score+",平均分="+total_score/studentNum/classNum);
        
        // 4) 九九乘法表
        for(int i = 1;i<=9;i++){
            int z = 0;
            for(int j = 1;j<=i;j++){
                z=i*j;
                System.out.print(i+"*"+j+"="+z);
                System.out.print("\t");
            } 
            System.out.print("\n");
        }
    
    }
}
