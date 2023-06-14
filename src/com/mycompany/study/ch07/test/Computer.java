package com.mycompany.study.ch07.test;

public class Computer extends Calculator01 {
    @Override
    public double calculateArea(double radius) {
        return Constants.PAI_2 * radius * radius;
    }
}

