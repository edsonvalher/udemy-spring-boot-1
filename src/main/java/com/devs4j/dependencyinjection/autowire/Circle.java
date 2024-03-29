package com.devs4j.dependencyinjection.autowire;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Circle implements figure {

    @Value("2.5")
    private double radius;

    @Override
    public double calculateArea() {
        // TODO Auto-generated method stub
        return Math.PI * Math.pow(radius, 2);
    }

}