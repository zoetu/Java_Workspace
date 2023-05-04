package com.hspedu.objectpoly;

public class Poly01 {
    public static void main(String[] args) {
        Master tom = new Master("汤姆");
        Dog dog = new Dog("大黄");
        Bone bone = new Bone("大棒骨");
        tom.feed(dog, bone);
        Cat cat = new Cat("小花");
        Fish fish = new Fish("小黄鱼");
        tom.feed(cat, fish);
    }
} 
