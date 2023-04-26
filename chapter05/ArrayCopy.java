package chapter05;

public class ArrayCopy {
    public static void main(String[] args) {
        // 将int[] arr1 = {10,20,30}; 拷贝到 arr2 数组, 要求数据空间是独立
        int[] arr1 = { 10, 20, 30 };

        // 创建一个新的数组arr2，开辟新的数据空间
        int[] arr2 = new int[arr1.length];

        // 遍历arr1, 把每个元素拷贝到arr2对应的元素位置
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        System.out.println("111");
    }
}
