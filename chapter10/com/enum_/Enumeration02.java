package chapter10.com.enum_;

public class Enumeration02 {
    public static void main(String[] args){
        System.out.println(Season.AUTUMN);
        System.out.println(Season.SPRING);

    }
}

class Season{
    private String name;
    private String desc;

    public static final Season SPRING = new Season("春天","温暖");
    public static final Season SUMMER = new Season("夏天","炎热");
    public static final Season AUTUMN = new Season("秋天","清凉");
    public static final Season WINTER = new Season("冬天","严寒");
    
    
    //1. 构造器私有化，防止直接new
    private Season(String name, String desc){
        this.name = name;
        this.desc = desc;
    }
    //2. 去掉set方法，防止属性被修改
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
