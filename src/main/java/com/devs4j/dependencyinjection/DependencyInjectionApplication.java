package com.devs4j.dependencyinjection;

import com.devs4j.dependencyinjection.atributo.Carro;
import com.devs4j.dependencyinjection.profiles.EnvironmentService;
import com.devs4j.dependencyinjection.qualifers.Animal;
import com.devs4j.dependencyinjection.qualifers.Avion;
import com.devs4j.dependencyinjection.qualifers.Nido;
import com.devs4j.dependencyinjection.qualifers.Pajaro;
import com.devs4j.dependencyinjection.qualifers.Perro;
import com.devs4j.dependencyinjection.scopes.EjemploScopeService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DependencyInjectionApplication {
	private static final Logger log = LoggerFactory.getLogger(DependencyInjectionApplication.class);

	// declaraciones explicitas para modificar objetos que son finales
	@Bean
	public String getApplicationName() {
		return "Yo soy String con nombre";
	}

	public static void main(String[] args) {

		// colocar contexto lugar donde viven objetos administrador por
		ConfigurableApplicationContext context = SpringApplication.run(DependencyInjectionApplication.class, args);

		// Carro carro = context.getBean(Carro.class);
		// System.out.println(carro);

		/*
		 * Perro perro = context.getBean(Perro.class); log.info("Objecto perro {}",
		 * perro.getNombre());
		 */

		/*
		 * Pajaro pajaro = context.getBean(Pajaro.class); log.info("Objecto pajaro {}",
		 * pajaro.getNombre());
		 */

		/*
		 * Avion avion = context.getBean(Avion.class); avion.Volar();
		 */

		/*
		 * Animal animal = context.getBean("pajarito", Animal.class);
		 * log.info("Animal {} edad {}", animal.getNombre(), animal.getEdad());
		 */

		/*
		 * Nido nido = context.getBean(Nido.class); nido.Imprimir();
		 */

		/*
		 * EnvironmentService environmentService =
		 * context.getBean(EnvironmentService.class); log.info("Active environment  {}",
		 * environmentService.getEnvironment());
		 */

		/*
		 * EjemploScopeService ejemploScopeService =
		 * context.getBean(EjemploScopeService.class); EjemploScopeService
		 * ejemploScopeService1 = context.getBean(EjemploScopeService.class);
		 * 
		 * log.info("Los beans son iguales equal {}",
		 * ejemploScopeService.equals(ejemploScopeService1));
		 * log.info("Los beans son iguales == {}", ejemploScopeService ==
		 * ejemploScopeService1);
		 */

		String nombreAplicacion = context.getBean(String.class);
		log.info("Nombre de la aplicación es {}", nombreAplicacion);

	}

}
