package com.pluralsight;

public class FullNameGenerator {
    public void execute() {
        System.out.println("FullNameGenerator: FullNameGenerator.execute() executed");
    }
    
    public static void main(String[] args) {
        FullNameGenerator app = new FullNameGenerator();
        app.execute();
    }
}
