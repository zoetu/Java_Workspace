package chapter06;

public class VarParameter01 {
    public static void main(String[] args){
        HspMethod s = new HspMethod();
        System.out.print(s.sum(1,2,5));

    }   
}

class HspMethod{
    public int sum(int n1,int n2,int n3){
        return n1+n2+n3;
    }
    public int sum(int n1,int n2,int n3,int n4){
        return n1+n2+n3+n4;
    }

    // ... 方法名称相同，功能相同，参数个数不同 -> 使用可变参数优化
    // 1. int... 表示接受的是可变参数，类型是int，即可以接收多个int(0-多)
    // 2. 使用可变参数时，可以当做数组来使用 即 nums 可以当做数组
    public int sum(int... nums){
        System.out.print("接收的参数个数="+nums.length);
        int res = 0;
        for(int i =0;i<nums.length;i++){
            res+=nums[i];
        }
        return res;
    }
}
