package chapter05;

public class TwoDimensionalArray03 {
    public static void main(String[] args){
        //创建三个一维数组，每个一维数组还未开辟空间
        int[][] arr = new int [3][];
        for(int i =0;i<arr.length;i++){
            arr[i] = new int[i+1]; //给每个一维数组开辟空间
            for(int j =0;j<arr[i].length;j++){
                arr[i][j] = i+1;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
