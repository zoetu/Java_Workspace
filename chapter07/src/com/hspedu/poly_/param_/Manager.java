package com.hspedu.poly_.param_;

public class Manager extends Employee{
    private double bonus;

    public Manager(String name,double salary,double bonus){
        super(name, salary);
        this.bonus = bonus;
    }

    public void manage(){
        System.out.println("经理"+getName()+"管理中。。");
    }
    @Override
    public double getAnnual(){
        return super.getAnnual()+bonus;
    }
}
