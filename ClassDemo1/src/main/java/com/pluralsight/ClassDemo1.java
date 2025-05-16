package com.pluralsight;

public class ClassDemo1 {
    public void execute() {
        System.out.println("ClassDemo1: ClassDemo1.execute() executed");
    }
    
    public static void main(String[] args) {
        ClassDemo1 app = new ClassDemo1();
        app.execute();
    }
}
