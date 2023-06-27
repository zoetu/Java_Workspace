package com.hspedu.map_;
import java.util.*;

public class MapExercise{
    public static void main(String[] args) {
        Map hashMap = new HashMap();
        hashMap.put(1,new Emp("jack",30000,1));
        hashMap.put(2,new Emp("zoe",10000,2));
        hashMap.put(3,new Emp("mailan",2000,3));

        Set keyset = hashMap.keySet();
        for(Object key:keyset){
            Emp emp =(Emp)hashMap.get(key);
            System.out.println(emp);
        }
    }
}

class Emp{
    private String name;
    private double sal;
    private int id;

    public Emp(String name,double sal,int id){
        this.name = name;
        this.sal = sal;
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getSal(){
        return sal;
    }
    public void setSal(int sal){
        this.sal=sal;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    @Override
    public String toString(){
        return "Emp{" +
        "name='" + name + '\'' +
        ", sal=" + sal +
        ", id=" + id +
        '}';
    }
}