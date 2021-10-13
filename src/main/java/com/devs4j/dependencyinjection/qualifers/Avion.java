package com.devs4j.dependencyinjection.qualifers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Avion implements Volador {

    private static final Logger log = LoggerFactory.getLogger(Pajaro.class);

    @Override
    public void Volar() {
        log.info("soy un Avion y tengo que volar");
    }

}