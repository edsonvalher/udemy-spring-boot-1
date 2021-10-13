package com.devs4j.dependencyinjection.scopes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
// @Scope("prototype")
@Scope("singleton")
public class EjemploScopeService {

}