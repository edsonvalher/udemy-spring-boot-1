package com.devs4j.dependencyinjection.qualifers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Nido {

    private static final Logger log = LoggerFactory.getLogger(Pajaro.class);

    // @Qualifier("pajarito")
    @Autowired
    private Animal animal;

    public void Imprimir() {
        log.info("el nido tiene un animal {}", animal.getNombre());
    }

}