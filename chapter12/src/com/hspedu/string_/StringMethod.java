package com.hspedu.string_;

public class StringMethod {
    public static void main(String[] args) {
        String s = new String("");
        for(int i=0;i<8;i++){
            s += "hello";
        }
        System.out.println(s);

        String name = "hello,张三";
        System.out.println(name.substring(5)); // ,张三
        System.out.println(name.substring(2, 5)); // llo
        
        System.out.println(name.charAt(6));
        System.out.println(name.indexOf("l"));
        System.out.println(name.lastIndexOf("l"));

        String s1 = "heLlo";
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());

        String s2 = ",宋！";
        s2 = s1.concat(s2);
        System.out.println(s2);
        System.out.println(s2.replace("宋","Zoe"));

        String[] split = s2.split(",");
        for(int i =0;i<split.length;i++){
            System.out.println(split[i]);
        }

        char[] chs = s2.toCharArray();
        for(int i=0;i<chs.length;i++){
            System.out.println(chs[i]);
        }

        String full_name = "zoe";
        int age = 10;
        String info1 = "我的姓名是"+full_name+" 年龄是"+age;
        System.out.println("info1= "+info1);
        String formatStr = "我的姓名是%s 年龄是%d";
        String info2 = String.format(formatStr, full_name,age);
        System.out.println("info2= "+info2);


    }
}
