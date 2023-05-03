package chapter06;

public class This {
    public static void main(String[] args){
        Dog dog1 = new Dog("小黄",11);
        System.out.println("this.hashcode="+dog1.hashCode());
        dog1.info();
        Dog dog2 = new Dog("小白", 20);
        System.out.println("this.hashcode="+dog2.hashCode());
        dog2.info();
    }
    
}
class Dog{
    String name;
    int age;
   public Dog(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("this.hashcode="+this.hashCode());
   } 
   public void info(){
        System.out.println("this.hashCode="+this.hashCode());
        System.out.println(name+"\t"+age+"\t");
   }
}
