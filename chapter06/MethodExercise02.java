package chapter06;

public class MethodExercise02 {
    public static void main(String []args){
    // 1) 编写类 MyTools 类，编写一个方法可以打印二维数组的数据。
    // 2) 编写一个方法 copyPerson，可以复制一个 Person 对象，返回复制的对象。
    // 克隆对象， 注意要求得到新对象和原来的对象是两个独立的对象，只是他们的属性相同
        int[][] arr = {{1,2,3},{34,34,6}};
        MyTools m = new MyTools();
        m.output(arr);

        Person p = new Person();
        p.name="jack";
        p.age=10;
        Person p2 = m.copyPerson(p);
        System.out.println("person p ="+p.name+" "+p.age);
        System.out.println("person p2 ="+p2.name+" "+p2.age);

        //判断对象是否为同一个
        System.out.print(p==p2); // false
    }
}


class MyTools{
    public int[][] output(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        return arr;
    }
    public Person copyPerson(Person p){
        Person p2 = new Person();
        p2.name = p.name;
        p2.age = p.age;
    
        return p2;
    }

}

class Person{
    String name;
    int age;
}