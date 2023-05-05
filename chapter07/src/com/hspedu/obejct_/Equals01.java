package com.hspedu.obejct_;

public class Equals01 {
    public static void main(String[] args) {
        A a = new A(); 
        A b = a; // 指向同一个地址空间
        A c = b;
        System.out.println(a==b); // true 
        System.out.println(c==b); // true 

        B bObj = a;
        System.out.println(bObj==c); // true 

        int x = 10;
        double d = 10.0;
        System.out.println(x==d);//true

        /*
        public boolean equals(Object anObject) {
        if (this == anObject) {
            return true;
        }
        return (anObject instanceof String aString)
                && (!COMPACT_STRINGS || this.coder == aString.coder)
                && StringLatin1.equals(value, aString.value);
        } */

        System.out.println("hello".equals("hi")); // false

        /*
        public boolean equals(Object obj) {
            if (obj instanceof Integer) {
                return value == ((Integer)obj).intValue();
            }
            return false;
    }
         */

        Integer integer1 = new Integer(1000);
        Integer integer2 = new Integer(1000);


        System.out.println(integer1 == integer2); // false
        System.out.println(integer1.equals(integer2)); // true

    }
   
}

class B{}

class A extends B{}
