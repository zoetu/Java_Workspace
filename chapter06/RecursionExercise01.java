package chapter06;

public class RecursionExercise01 {
    public static void main(String[] args) {
        // 1）使用递归实现斐波那契数1，1，2，3，5，8，13....
        // 给你一个整数n，求出它的值是多少
        T t = new T();
        int res = t.fibonacci(7);
        System.out.println("fibonacci = "+res);
        // 2）猴子吃桃问题：有一堆桃子，猴子第一天吃了其中的一半，并再多吃了一个！
        // 以后每天猴子都吃其中的一半，然后再多吃一个。
        // 当到第10天时，想再吃时（即还没吃），发现只有1个桃子了。
        // 问题：最初共有多少个桃子？
        int tao = t.tao(1);
        System.out.println("一共"+tao+"个桃子。");

        
    }
    
}

class T{
    public int fibonacci(int n){
        // 3=2+1;5=3+2;....
        if(n>=1){
            if(n==1||n==2){
                return 1;
            }else{
                return fibonacci(n-1)+fibonacci(n-2);   
            }
        }else{
            System.out.println("请输入>1的整数");
            return -1;
        }
    }

    public int tao(int day){
        // day10, tao=1
        // day9, tao=(day10+1)*2
        // day8, tao=(day9+1)*2
        // tao=(后一天的tao+1)*2
        if(day == 10){
            return 1;
        }else if(day>=1 && day<=9){
            return((tao(day+1)+1)*2);
        }else{
            System.out.println("请输入1-10的数字");
            return -1;
        }
    }
}
