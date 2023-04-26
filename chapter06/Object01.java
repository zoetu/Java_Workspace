package chapter06;

public class Object01 {
    public static void main(String[] args){
    
        //使用OOP面向对象解决
        //实例化一只猫 
        // 1. new Cat() 创建一只猫
        // 2. Cat cat1 = new Cat(); 把创建的猫赋给cat1
        Cat cat1 = new Cat();
        cat1.name = "小白";
        cat1.age = 3;
        cat1.color = "白色";

        Cat cat2 = new Cat();
        cat2.name = "小黑";
        cat2.age = 4;
        cat2.color = "黑色";

        //怎么访问对象的属性
        System.out.println("第一只猫的信息："+cat1.name+" "
                            +cat1.age+" "+cat1.color);
        System.out.println("第二只猫的信息："+cat2.name+" "
                            +cat2.age+" "+cat2.color);
    }    
}

//定义一个猫类 一个数据类型
class Cat{
    //属性
    String name;
    int age;
    String color;

}
