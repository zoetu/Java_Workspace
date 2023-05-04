package com.hspedu.extend_.exercise;


public class PC extends Computer {
    // 编写PC 子类，继承 Computer 类，添加特有属性【品牌 brand】 

    private String brand;

    public PC(String cpu,int memory,int disk,String brand){
        super(cpu, memory, disk);
        this.brand=brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void printInfo(){
        System.out.println("PC信息如下：");
        System.out.println(getDetails()+"brand:" + brand);

    }
}
