package com.hspedu.obejct_;

public class HashCode {
    public static void main(String[] args) {
        AA aa = new AA();
        AA b = aa;
        AA aa2 = new AA();
        System.out.println(aa.hashCode()); //925858445
        System.out.println(b.hashCode()); // 925858445
        System.out.println(aa2.hashCode()); //798154996
    }
}
class AA{}