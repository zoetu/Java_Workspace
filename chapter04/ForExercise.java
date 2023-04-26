package chapter04;

public class ForExercise {
    public static void main(String[] args){
        // int count = 0;
        // int sum = 0;
        // for(int i =1; i<100; i++){
        //     if(i%9==0){
        //         System.out.println("i="+i);
        //         count++;
        //         sum=sum+i;
        //     }
        // }
        // System.out.println(count);
        // System.out.println(sum);

        int count = 0;
        int sum = 0;
        int start = 0;
        int end = 100;
        int t = 9;
        for(int i =start; i<end; i++){
            if(i%t==0){
                System.out.println("i="+i);
                count++;
                sum=sum+i;
            }
        }
        System.out.println(count);
        System.out.println(sum);
    }
}
