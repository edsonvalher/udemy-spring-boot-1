package com.devs4j.dependencyinjection.autowire;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Square implements figure {

    @Value("2.5")
    private double side;

    @Override
    public double calculateArea() {
        // TODO Auto-generated method stub
        return side * side;
    }

}