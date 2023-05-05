package com.hspedu.poly_.polyarr_;

public class Student extends Person {
    private double score;

    public Student(String name,int age,double score) {
        super(name,age);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    // 重写父类的say
    public String say(){
        return "学生信息："+super.say()+" 分数 "+score;
    }
    public void study(){
        System.out.println("学生"+getName()+"正在学习");
    }

}