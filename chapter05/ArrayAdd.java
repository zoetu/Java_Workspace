package chapter05;

import java.util.Scanner;

public class ArrayAdd {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int[] arr = {1,2,3};

        do{
            int[] arrNew = new int[arr.length+1];
            //拷贝元素
            for(int i =0;i<arr.length;i++){
              arrNew[i]=arr[i];
            }

            System.out.println("输入要添加的元素：");
            int add = myScanner.nextInt();

            //赋值给最后一个
            arrNew[arrNew.length-1]=add;
            //arr指向arrNew
            arr=arrNew;

            //输出扩容结果
            for(int i = 0;i<arrNew.length;i++){
                System.out.print(arrNew[i]+"\t");
            }

            //询问用户是否继续
            System.out.println("是否继续添加？y/n");
            char key = myScanner.next().charAt(0);
            if(key=='n'){
                break;
            }
        }while(true);

        System.out.println("您已退出添加...");

    }
    
}
