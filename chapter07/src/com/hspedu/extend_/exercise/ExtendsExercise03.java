package com.hspedu.extend_.exercise;

public class ExtendsExercise03 {
    public static void main(String[] args) {
        // 编写 Test 类，在 main 方法中创建 PC 和 NotePad 对象，
        // 分别给对象中特有的属性赋值，以及从 Computer 类继承的 属性赋值，
        // 并使用方法并打印输出信息
        PC pc = new PC("intel", 16, 500, "IBM");
        pc.printInfo();

        NotePad ipad = new NotePad("AMD", 8, 128, "LightGrey");
        ipad.printInfo();
        }
}
