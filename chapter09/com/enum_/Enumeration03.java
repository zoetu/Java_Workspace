package chapter09.com.enum_;

public class Enumeration03 {
    public static void main(String[] args){
        System.out.println(Season2.AUTUMN);
    }
}

enum Season2{ //1. enum关键字定义类
    //2. public static final Season SPRING = new Season("春天", "温暖") 直接使用
    // SPRING("春天", "温暖") 解读 常量名(实参列表)
    SPRING("春天","温暖"),SUMMER("夏天","炎热"), AUTUMN("秋天","凉爽"),WINTER("冬天","寒冷");
    //3. 多个常量（对象），用逗号，间隔
    
    //4.使用enum实现枚举，要求定义常量对象写在前面
    private String name;
    private String desc;//描述
    
    //5.使用无参构造器，创建常量对象，可以省略()
    private Season2(){
    }
    
    private Season2(String name, String desc){
        this.name = name;
        this.desc = desc;
    }
    public String getName() {
        return name;
    }
    public String getDesc() {
        return desc;
    }
    public static Season getSpring() {
        return SPRING;
    }
    public static Season getSummer() {
        return SUMMER;
    }
    public static Season getAutumn() {
        return AUTUMN;
    }
    public static Season getWinter() {
        return WINTER;
    }

    @Override
    public String toString(){
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
    
}
