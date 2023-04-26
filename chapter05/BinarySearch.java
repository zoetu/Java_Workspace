package chapter05;

import java.lang.annotation.Target;
import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args){
        // 请对一个有序数组进行二分查找 {1,8, 10, 89, 1000, 1234} 
        // 输入一个数看看该数组是否存在此数，并且求出下标
        // 如果没有就提示"没有这个数"。
        Scanner myScanner = new Scanner(System.in);
        int[] nums = {1,8, 10, 89, 1000, 1234};

        System.out.println("请输入要查找的数字：");
        int x = myScanner.nextInt();
        // 二分查找
        // 1)左闭右开
        // int left = 0;
        // int right = nums.length;
        // int middle = 0;
        // int index = -1;
        // while(left<right){
        //     middle = left+(right-left)/2;
        //     if(x < nums[middle]){
        //         right = middle;
        //     }else if(x > nums[middle]){
        //         left = middle+1;
        //     }else{
        //         index = middle;
        //         break;
        //     }
        // }
        // 2）左闭右闭
        int left = 0;
        int right = nums.length-1;
        int index = -1;
        while(left<=right){
            int middle = left+(right-left)/2;
            if(x<nums[middle]){
                right = middle-1;
            }else if(x>nums[middle]){
                left = middle+1;
            }else{
                index = middle;;
                break;
            }
        }

        if(index != -1){
            System.out.print("查找到"+x+",位于第"+index+"个位置!");
        }else{
            System.out.println("查找失败！");
        }
        

    }
}
