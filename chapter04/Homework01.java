package chapter04;

public class Homework01 {
    public static void main(String[] args){
        double money = 100000;
        int count = 0;
        while(money>=0){
            if(money>50000){
                money = money-0.05*money;
                count++;
            }else if(money<=50000 && money>1000){
                money = money - 1000;
                count++;
            }else{
                break;
            }
        }
        System.out.println("路过"+count+"次");
    }
}
