package chapter05;

public class BubbleSort {
    public static void main(String[] args) {
        // 24,69,80,57,13
        int[] arr = {24,69,80,57,13};
        int temp = 0;
        
        System.out.println("=======冒泡排序前的数组为：=========");

        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }

        for(int i =0;i<arr.length-1;i++){ // 1. 5个元素需要4轮排序
            temp = 0;
            for(int j=0;j<arr.length-1-i;j++){ // 2. 每轮选出一个最大值
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println("\n"+"=======冒泡排序后的数组为：=========");
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}
