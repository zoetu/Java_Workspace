package chapter05;

public class Homework04 {
    public static void main(String[] args){
        int[] arr = {10,12,45,90};
        int num = 23;
        // num <= arr，插入到数组中间位置
        // num >arr, 插入到末尾

        int[] newArr = new int[arr.length+1];

        int index = -1;
        for(int i = 0;i<arr.length;i++){
            if(num<=arr[i]){
                index=i;
                break;
            }
        }
        if(index == -1){
            index = arr.length;
        }

        System.out.println(index);

        // 扩容
        
        // if(index == arr.length){
        //     newArr[index] = num;
        //     for(int i = 0;i<newArr.length;i++){
        //         newArr[i] = arr[i];
        //     }
        //     arr=newArr;
        // }else{
        //     for(int i = 0;i<newArr.length;i++){
        //         if(i<index){
        //             newArr[i] = arr[i];
        //         }else if(i>index){
        //             newArr[i] = arr[i-1];
        //         }else{
        //             newArr[index] = num;
        //         }
        //     }
        //     arr=newArr;
        // }

        // 更简洁
        for(int i=0,j=0;i<newArr.length;i++){
            if(i != index){
                newArr[i] = arr[j];
                j++;
            }else{
                newArr[i] = num; 
            }
        }
        arr = newArr;

        // 输出结果
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
