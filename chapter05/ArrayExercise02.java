package chapter05;

public class ArrayExercise02 {
    public static void main(String[] args){
        // 请求出一个数组 int[]的最大值 {4,-1,9, 10,23}，并得到对应的下标
        int[] nums = {4,-1,9, 10,23};

        int max = nums[0];

        int maxIndex = 0;
        for(int i =0 ;i<nums.length;i++){
            if(max<nums[i]){
                max = nums[i];
                maxIndex=i;
            }
        }

        System.out.println("max="+max+" maxIndex="+maxIndex);
    }
}
