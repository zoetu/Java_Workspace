package com.hspedu.pkg;

import com.hspedu.modifier.A;

public class Test {
    public static void main(String[] args){
        A a = new A();
        //在不同包下，可以访问public修饰的属性或方法
        System.out.println(a.n1);
        // 不能访问 protected 默认和private修饰的属性和方法
    }
}
