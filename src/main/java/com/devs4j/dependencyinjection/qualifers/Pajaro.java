package com.devs4j.dependencyinjection.qualifers;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component("pajarito")
@Component
@Primary
public class Pajaro extends Animal implements Volador {

    public Pajaro(@Value("1") Integer edad, @Value("Pajaro Loco") String nombre) {
        super(edad, nombre);
        // TODO Auto-generated constructor stub
    }

    private static final Logger log = LoggerFactory.getLogger(Pajaro.class);

    @Override
    public void Volar() {
        // TODO Auto-generated method stub
        log.info("Soy un pajaro y estoy volando!!");

    }

}