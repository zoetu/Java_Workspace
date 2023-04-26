package chapter05;

public class Homework05 {
    public static void main(String[] args){
        int[] arr = new int[10];

        for(int i = 0;i<arr.length;i++){
            arr[i] = (int)(Math.random()*100)+1;
        }

        System.out.println("======arr 元素========");
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.println("======倒叙arr 元素========");
        for(int i = arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        // 平均值、求最大值及其下标
        int totalSum = 0;
        int avg = 0;
        int maxValue = 0;
        int maxIndex = 0;
        for(int i = 0;i<arr.length;i++){
            totalSum+=arr[i];
            if(arr[i]>maxValue){
                maxIndex=i;
                maxValue=arr[i];
            }
        }
        avg = totalSum/arr.length;
        System.out.println("平均值="+avg);
        System.out.println("最大值="+maxValue+";下标="+maxIndex);


        // 查找是否含有8
        int label = -1;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==8){
                label = i;
                System.out.println("含有8，在第"+label+"个位置！");
                break;
            }
        }
        if(label == -1){
            System.out.println("不含有8");
        }
    }
    
}
