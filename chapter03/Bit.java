package chapter03;

public class Bit {
    public static void main(String []args){
    int a=1>>2; // 向右位移 2 位 0000 0001 >> 0000 0000 = 0
    int b=-1>>2;//算术右移  [1]0000001>> [1]0000001 = -1
    int c=1<<2;//算术左移 [0] 0000001<< [0]0000100 = 4
    int d=-1<<2;//[1] 0000001<< [1]0000100 = -4
    int e=3>>>2;//逻辑右移（无符号右移） 0000 0011 >>> 0000 0000 = 0
    //a,b,c,d,e 结果是多少
    System.out.println("a="+a);
    System.out.println("b="+b);
    System.out.println("c="+c);
    System.out.println("d="+d);
    System.out.println("e="+e);

    //练习题
    System.out.println("~2="+~2); // 0000 0010（在原码反码补码相同） -> 0000 0011=-3
    System.out.println("2&3="+(2&3)); // 0000 0010 & 0000 0011 -> 00000010=2
    System.out.println("2|3="+(2|3));// 0000 0010 | 0000 0011 -> 00000011=3
    System.out.println("~-5="+(~-5));// 1000 0101 取反-> 0000 0100（正数）= 4
    System.out.println("13&7="+(13&7)); // 5
    System.out.println("5|4="+(5|4)); // 5
    System.out.println("-3^3="+(-3^3));// 1000 0011^0000 0011-> 1111 1101^0000 0011->1111 1110(补码)->1000 0010 =-2

    }        
}