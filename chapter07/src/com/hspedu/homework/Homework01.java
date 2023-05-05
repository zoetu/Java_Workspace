package com.hspedu.homework;

public class Homework01 {
    public static void main(String[] args) {
        Person[] persons = new Person[5];
        persons[0] = new Person("jack", 20, "大数据工程师");
        persons[1] = new Person("jack", 22, "大数据工程师");
        persons[2] = new Person("jack", 10, "大数据工程师");
        persons[3] = new Person("jack", 23, "大数据工程师");
        persons[4] = new Person("jack", 5, "大数据工程师");

        Person temp = null;
        for(int i =0;i<persons.length-1;i++){
            for(int j =0;j<persons.length-1-i;j++){
                if(persons[j].getAge()<persons[j+1].getAge()){
                    temp = persons[j];
                    persons[j] = persons[j+1];
                    persons[j+1] = temp;
                }
            }
        }
        // 输出排序的结果
        for(int i =0;i<persons.length;i++){
            System.out.println(persons[i]);
        }
      
    }
}

class Person{
    private String name;
    private int age;
    private String job;

    public Person(){

    }
    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }
    @Override
    public String toString(){
        return "Person{"+
                "name="+name+'\''+
                ",age="+age+
                ",job="+job+'\''+
                '}';
    }
}
