package chapter06;

import java.security.PublicKey;
import java.util.Random;
import java.util.Scanner;

public class Homewotk14 {
    public static void main(String[] args){
        // 14. Tom设计他的成员变量.成员方法，可以电脑猜拳
        // 电脑每次都会随机生成0,1,2
        // 0表示石头 1表示剪刀 2表示布
        // 并要可以显示Tom的输赢次数(清单)
        Tom t = new Tom();
        t.shwoInfo(4);

    }
    
}
class Tom{
    int tomGuessNum;
    int comGuessNum;
    int winCountNum;

    public int comGuess(){
        Random r = new Random();
        int comGuessNum = r.nextInt(2); // 随机生成0-2
        System.out.println("电脑输出："+comGuessNum);
        return comGuessNum; 
    }
    public int tomGuess(){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入：0/1/2, 其中0表示石头 1表示剪刀 2表示布");
        int tomGuessNum = myScanner.nextInt(); //用户输入
        if(tomGuessNum==0 || tomGuessNum==1 || tomGuessNum==2){
            return tomGuessNum;
        }else{
            System.out.println("输入错误");
            return -1;
        }
    }

    public String vsCom(){ // 对局信息
        int tomGuessNum = tomGuess();
        int comGuessNum = comGuess();
        if((tomGuessNum==0&&comGuessNum==1)||(tomGuessNum==1&&comGuessNum==2)||(tomGuessNum==2&&comGuessNum==0)){
            winCountNum+=1;
            return "Tom赢";
        }else if((tomGuessNum==2&&comGuessNum==1)||(tomGuessNum==0&&comGuessNum==2)||(tomGuessNum==1&&comGuessNum==0)){
            return "电脑赢";
        }else{
            return "平手";
        } 
    }
    
    public void shwoInfo(int n){
        for(int i=0;i<n;i++){
            String res = vsCom();
            System.out.println(res+"!");
        }
        System.out.println("对局"+n+"次，"+"Tom一共赢了"+winCountNum+"次");
    }
}
