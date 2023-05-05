package com.hspedu.poly_.polyarr_;

public class PloyArray {
    public static void main(String[] args){
        Person[] persons = new Person[5];
        persons[0] = new Person("zoe", 19);
        persons[1] = new Student("jack",22,66);
        persons[2] = new Student("song",20,96);
        persons[3] = new Teacher("jay", 33,5000);
        persons[4] = new Teacher("JJ", 30,10000);
        
        //循环遍历多态数组，调用say
        for(int i=0;i<persons.length;i++){
            System.out.println(persons[i].say()); //动态绑定机制

            // 调用子类特有的方法
            if(persons[i] instanceof Student){ //判断person[i]的运行类型是不是Student
                Student student = (Student) persons[i]; //向下转型
                student.study();
            }else if(persons[i] instanceof Teacher){
                Teacher teacher = (Teacher) persons[i];
                teacher.teach();
            }else if(persons[i] instanceof Person){
                   //
            }else{
                System.out.println("类型有误，请检查");
            }
        }

    }
    
}
