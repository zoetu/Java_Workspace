package chapter03;
import java.util.Scanner; // 1.导入Scanner类所在包

public class Input {
    public static void main(String[] args){

        // 2.创建Scanner对象，new就是创建一个对象
        Scanner myScanner = new Scanner(System.in); // myScanner就是Scanner类的对象
        System.out.println("Input Name,please:");
        // 3. 接收用户输入了， 使用相关的方法
        String name = myScanner.next(); // 接收用户输入的字符串
        System.out.println("Input Age,please:");
        int age = myScanner.nextInt(); //接收用户输入 int
        System.out.println("Input Salary,please:");
        double sal = myScanner.nextDouble(); //接收用户输入 double
        System.out.println("Personal Info:");
        System.out.println("Name:"+name+";Age:"+age+";Salary:"+sal);
    }
    
}
