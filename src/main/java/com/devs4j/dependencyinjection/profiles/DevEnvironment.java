package com.devs4j.dependencyinjection.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//@Profile({ "Dev", "default" }) // para definir como default este perfil
@Service
@Profile("Dev")
public class DevEnvironment implements EnvironmentService {

    @Override
    public String getEnvironment() {
        // TODO Auto-generated method stub
        return "Dev";
    }

}