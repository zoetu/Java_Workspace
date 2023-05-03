package chapter06;

public class Constructor01 {
    public static void main(String[] args){
        Pperson p1 = new Pperson("smith", 80);
        System.out.println("p1对象name="+p1.name);
        System.out.println("p1对象age="+p1.age);
    }
}
class Pperson{
    String name;
    int age;
    public Pperson(String pName,int pAge){
        System.out.println("构造器被调用~ 完成对象的属性初始化");
        name = pName;
        age = pAge;
    }
}