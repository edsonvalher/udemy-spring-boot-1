package com.devs4j.dependencyinjection.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("Qa")
public class QaEnvironment implements EnvironmentService {

    @Override
    public String getEnvironment() {
        // TODO Auto-generated method stub
        return "Qa";
    }

}