package chapter06;

public class OverLoad01 {
    public static void main(String[] args){
        MyCalculator mycal = new MyCalculator();
        System.out.println(mycal.calculator(1, 1.8));

    }
}

class MyCalculator{
    public int calculator(int n1,int n2){
        int res = n1 + n2;
        return res;
    }
    public double calculator(int n1,double n2){
        double res = n1 + n2;
        return res;
    }
    public double calculator(double n1,int n2){
        double res = n1 + n2;
        return res;
    }
    public int calculator(int n1,int n2,int n3){
        int res = n1 + n2 + n3;
        return res;
    }
}
