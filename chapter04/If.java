package chapter04;

public class If {
    public static void main(String[] args){
        boolean b = true;
        if(b=false)
            System.out.println("a");
        else if(b)
            System.out.println("b");
        else if(!b)
            System.out.println("c");
        else
            System.out.println("d");
    }
}
