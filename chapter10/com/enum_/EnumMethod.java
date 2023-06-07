package chapter10.com.enum_;

public class EnumMethod {
    public static void main(String[] args){

        Season2 autumn = Season2.AUTUMN;

        //输出枚举对象的名字
        System.out.println(autumn.name());
        //输出该枚举对象的次序/编号，从0开始
        System.out.println(autumn.ordinal());

        System.out.println(autumn.toString());
        System.out.println(autumn.name());

        //含有定义的所有枚举对象
        Season2[] values = Season2.values();
        System.out.println("===遍历取出枚举对象===(增强for循环)");
        for(Season2 season:values){
            System.out.println(season);
        }
        // valueOf: 将字符串转换成枚举对象，要求字符串必须为已有常量名
        // 否则报异常
        Season2 autumn1 = Season2.valueOf("AUTUMN");
        System.out.println("autumn1="+autumn);
        System.out.println(autumn==autumn1);

        // compareTo: 比较两个枚举常量，比较的就是编号
        System.out.println(Season2.AUTUMN.compareTo(Season2.SUMMER)); // 3-2=1
            
    }
}