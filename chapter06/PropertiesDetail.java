package chapter06;

public class PropertiesDetail {
    public static void main(String[] args){
        //创建Person对象
        Person person1 = new Person();
        System.out.println("当前这个人的信息：");
        System.out.println("age="+person1.age+" name="+person1.name+
                        " sal="+person1.sal+" isPass="+person1.isPass);
    }
}

class Person{
    int age;
    String name;
    double sal;
    boolean isPass;
}
