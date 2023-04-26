package chapter05;

public class ArrayExercise01 {
    public static void main(String[] args){
        // 创建一个 char 类型的 26 个元素的数组，分别 放置'A'-'Z'。
        // 使用 for 循环访问所有元素并打印出来。
        // 提示：char 类型数据运算 'A'+2
        char[] chars = new char[26];
        for(int i =0;i<26;i++){
            chars[i]  = (char)('A'+i);
        }

        System.out.println("======数组=========");
        for(int i =0;i<26;i++){
            System.out.print(chars[i]+" ");
        }
    }
}
