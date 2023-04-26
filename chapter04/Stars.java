package chapter04;

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class Stars {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("输入想要的层数：");
        int n = myScanner.nextInt();

        // for(int i=1;i<=n;i++){ //版本1：半个金字塔
        //     for(int j=1; j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.print("\n");
        // }
        
        // for(int i=1;i<=n;i++){ //版本2：整个金字塔
        //     for(int k =1;k<=n-i;k++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<2*i-1;j++){
        //         System.out.print("*");
        //     }
        //     System.out.print("\n");
        // }

        for(int i=1;i<=n;i++){ //版本3:空心金字塔
            for(int k =1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1;j++){
                if(j==1||j==2*i-1||i==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }

    }
    
}
