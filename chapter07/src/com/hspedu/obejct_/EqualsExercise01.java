package com.hspedu.obejct_;

public class EqualsExercise01 {
    public static void main(String[] args) {
        Person person1 = new Person("jack", 20, '男');
        Person person2 = new Person("jack", 2, '男');
        System.out.println(person1.equals(person2));
    }
    
}

class Person{
    private String name;
    private int age;
    private char gender;
    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj instanceof Person){
            Person p = (Person)obj;
            return this.name.equals(p.name) && this.age==p.age && this.gender==p.gender;
        }
        return false;
    }
}