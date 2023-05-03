package com.hspedu.encap;

public class Encapsulation01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("jack");
        person.setAge(30);
        person.setSalary(10000);
        System.out.println(person.info());
    }

}

class Person {
    public String name;// 姓名公开
    private int age; // 年龄和工资私有化
    private double salary;

    public Person(){
        
    }

    public Person(String nam,int age,double salary){
        // this.name=name;
        // this.age=age;
        // this.salary=salary;

        // 将set方法写在构造器中，仍然可以进行验证
        setName(nam);
        setAge(age);
        setSalary(salary);
    }

    // 自己写setXXX getXXX太慢，使用快捷键生成
    // 然后根据要求来完善代码
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()>=2 && name.length()<=6){
            this.name = name;
        }else{
            System.out.println("名字的长度不对，需要2-6个字符，默认名字");
            this.name="Null";
        }
        
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<=120 && age>=1){
            this.age = age;
        }else{
            System.out.println("年龄设置错误，需要在1-120之间，默认年龄18");
            this.age=18;
        }
       
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //写一个方法，返回属性信息
    public String info(){
        return "信息为 name="+name+ " age="+age+" 薪水="+salary;
    }
}