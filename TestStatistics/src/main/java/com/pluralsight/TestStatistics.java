package com.pluralsight;

public class TestStatistics {
    public void execute() {
        System.out.println("TestStatistics: TestStatistics.execute() executed");
    }
    
    public static void main(String[] args) {
        TestStatistics app = new TestStatistics();
        app.execute();
    }
}
