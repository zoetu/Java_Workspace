package chapter06;

public class Method01 {
    public static void main(String[] args){
        //方法使用
        //注意：不能在同一个Package里有多个class 里拥有同样名字的类
        //1. 方法写好后，如果不去调用，不会输出
        //2. 先创建对象，然后调用方法即可
        Personx p1 = new Personx(); 
        p1.speak(); 
        p1.cal01();
        p1.cal02(3);
        int sum = p1.getSum(2, 3);
        System.out.print("getSum方法返回的值="+sum);
       
    }
}

class Personx{
    int age;
    String name;

    //方法（成员方法）
    //添加 speak 成员方法,输出 “我是一个好人”
    //1. public 表示方法是公开
    //2. void ： 表示方法没有返回值
    //3. speak() : speak 是方法名， () 形参列表
    //4. {} 方法体，写我们要执行的代码
    public void speak(){
        System.out.println("我是一个好人");
    }

    //添加 cal01 成员方法,可以计算从 1+..+1000 
    public void cal01(){
        int res = 0;
        for(int i =1;i<=1000;i++){
            res += i;
        }
        System.out.println("cal01方法 计算结果="+res);
    }

    //添加 cal02 成员方法,该方法可以接收一个数 n，计算从 1+..+n 的结果
    public void cal02(int n){
        int res = 0;
        for(int i =1;i<=n;i++){
            res += i;
        }
        System.out.println("cal02方法 计算结果="+res);
    }

    //添加 getSum 成员方法,可以计算两个数的和
    //1. public 表示方法是公开的
    //2. int :表示方法执行后，返回一个 int 值
    //3. getSum 方法名
    //4. (int num1, int num2) 形参列表，2 个形参，可以接收用户传入的两个数
    //5. return res; 表示把 res
    public int getSum(int num1, int num2){
        int res;
        res = num1+num2;
        return res;
    }
}