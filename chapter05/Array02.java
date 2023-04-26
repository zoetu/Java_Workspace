package chapter05;

import java.util.Scanner;

public class Array02 {
    public static void main(String[] args){
        
        // 1.创建一个double数组，大小5
        //(1) 第一种动态分配方式
        // double scores[] = new double[5];

        //(2) 第二种动态分配方式
        double scores[];
        scores = new double[5];

        //2. 循环输入
        Scanner myScanner = new Scanner(System.in);

        for(int i = 0;i<scores.length;i++){
            System.out.println("请输入第"+(i+1)+"个元素的值");
            scores[i] = myScanner.nextDouble();
        }
        
        // 输出，遍历数组
        System.out.println("==数组的元素/值的情况如下：==");
        for(int i=0; i<scores.length; i++){
            System.out.println("第"+(i+1)+"个元素的值="+scores[i]);
        }
    }
    
}
