package com.devs4j.dependencyinjection.autowire;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AreaCalculatorService {

    @Autowired
    private List<figure> figures;

    public double calcAreas() {
        double area = 0.0;
        for (figure f : figures) {
            area += f.calculateArea();
        }
        return area;
    }
}