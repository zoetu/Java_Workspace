package chapter09.com.enum_;

public class EnumExercise02 {
    public static void main(String[] args){
        Week[] days = Week.values();
        System.out.println("==所有星期的信息如下==");
        for(Week day:days){
            System.out.println(day);
        }
    }
}

enum Week{
    MONDAY("星期一"),TUESDAY("星期二"),WEDNESDAY("星期三"),THURSDAY("星期四"),FRIDAY("星期五");
    private String name;

    private Week(String name){
        this.name=name;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString(){
        return name;
    }
}
