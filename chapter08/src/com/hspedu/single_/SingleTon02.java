package com.hspedu.single_;

public class SingleTon02 {
    public static void main(String[] args){

        // GirlFriend xh = new GirlFriend("小红");
        // GirlFriend xx = new GirlFriend("小黄");

        //通过方法获取对象
        GirlFriend instance = GirlFriend.getInstance();
        System.out.println(instance);
        GirlFriend instance2 = GirlFriend.getInstance();
        System.out.println(instance2);

        System.out.println(instance==instance2); //相同的对象



    }
}


// 希望在程序运行过程中，只能创建一个GirlFriend对象
class GirlFriend{
    private String name;

    /* 饿汉式
    
    // 为了能够在静态方法中，返回GirlFriend对象，需要将其修饰成static
    private static GirlFriend gf = new GirlFriend("小红红");

    // 如何保障只能创建一个GirlFriend对象？
    // 步骤[单例模型-饿汉式]:
    // 1. 构造器私有化
    // 2. 类的内部直接创建对象(static)
    // 3. 提供一个公共的静态方法，返回gf对象
    private GirlFriend(String name){
        this.name=name;
        System.out.println("构造器被调用");
    }

    public static GirlFriend getInstance(){
        return gf;
    }
    */

    // 懒汉式
    private static GirlFriend gf; //默认null
    private GirlFriend(String name){
        this.name=name;
        System.out.println("构造器被调用");
    }
    public static GirlFriend getInstance(){
        if(gf == null){ //需要使用的时候再创建
            gf = new GirlFriend("小明");
        }
        return gf;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
        "name='" + name + '\'' +
        '}';
    }

}

