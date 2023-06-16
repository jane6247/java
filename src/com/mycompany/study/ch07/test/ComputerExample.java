package com.mycompany.study.ch07.test;

public class ComputerExample {
    public static void main(String[] args) {
        double radius = 5.0;        Computer computer = new Computer();
        double area = computer.calculateArea(radius);   
      System.out.println("원의 반지름: " + radius);
        System.out.println("원의 면적: " + area);
        
    }
}
