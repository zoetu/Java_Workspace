package com.hspedu.poly_.param_;

public class Woker extends Employee{
    public Woker(String name,double salary){
        super(name, salary);
    }

    @Override
    public double getAnnual(){
        return super.getAnnual();
    }
    public void work(){
        System.out.println("员工"+getName()+"正在工作");
    }
}
