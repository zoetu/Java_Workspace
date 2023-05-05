package com.hspedu.poly_.param_;


public class PloyPrameter {
    public static void main(String[] args) {
        Woker e = new Woker("Jack", 1000);
        Manager m = new Manager("zoe", 10000, 2000);

        Test t = new Test();
        t.showEmpAnnual(e);
        t.showEmpAnnual(m);
        t.testWork(e);
        t.testWork(m);
        
    }
}

class Test{
    public void showEmpAnnual(Employee e){ //父类形参允许实参是子类类型
        System.out.println(e.getName()+" 年入 "+e.getAnnual());
    }

    public void testWork(Employee e){
        if(e instanceof Woker){
            Woker w = (Woker) e; //向下转型
            w.work();
        }else if(e instanceof Manager){
            Manager m = (Manager) e;
            m.manage();
        }else{
            System.out.println("类型有误，请重新输入！");
        }
    }
}