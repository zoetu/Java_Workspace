package com.hspedu.customexception_;

public class CustomException {
    public static void main(String[] args){
        int age = 180;
        if(!(age>=18 && age<=120)){
            throw new AgeError("年龄应该在18-120之间");
        }
        System.out.println("您的年龄范围正确");
    }
}

class AgeError extends RuntimeException{
    public AgeError(String message){ //构造器
        super(message);
    }
}
