package com.hspedu.wrapper;

public class WrapperVSString {
    public static void main(String[] args) {
        Integer i = 100; //自动装箱
        String str1 = i+"";
        String str2 = i.toString();
        String str3 = String.valueOf(i);

        String str4= "12345";
        Integer i2 = Integer.parseInt(str4); //使用自动装箱
        Integer i3= new Integer(str4); // 构造器

        System.out.println("OK!!");
    }
}
