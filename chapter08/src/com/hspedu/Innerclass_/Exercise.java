package com.hspedu.Innerclass_;


public class Exercise {
    public Exercise(){
        Inner s1 = new Inner();
        s1.a=10;
        System.out.println("s1.a="+s1.a);
        Inner s2 = new Inner();
        System.out.println("s2.a="+s2.a);
        
    }

    class Inner{
        public int a = 5;
    }

    public static void main(String[] args) {
        Exercise e = new Exercise();
        Inner r = e.new Inner();
        System.out.println("r.a="+r.a);
    }
}
