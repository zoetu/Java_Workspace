package chapter05;

public class TwoDimensionalArray01 {
    public static void main(String[] args){
    /*
    请用二维数组输出如下图形
    0 0 0 0 0 0
    0 0 1 0 0 0
    0 2 0 3 0 0
    0 0 0 0 0 0
    */
    int[][] arr = { {0, 0, 0, 0, 0, 0}, {0, 0, 1, 0, 0, 0}, {0,2, 0, 3, 0, 0}, {0, 0, 0, 0, 0, 0}};

    for(int i =0;i<arr.length;i++){
        // 遍历二维数组的每个元素（数组）
        // 1. arr[i] 表示二维数组的第i个元素
        // 2. arr[i].length得到对应每个一维数组的长度
        for (int j=0;j<arr[i].length;j++){
            System.out.print(arr[i][j]+" "); //输出一维数组
        }
        System.out.println();
    }
    }
    
}
