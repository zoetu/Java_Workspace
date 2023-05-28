package chapter09.com.enum_;

public class EnumMethod {
    public static void main(String[] args){
        Season2 autumn = Season2.AUTUMN;

        //输出枚举对象的名字
        System.out.println(autumn.name());
        //输出该枚举对象的次序/编号，从0开始
        System.out.println(autumn.ordinal());
        

    }
}