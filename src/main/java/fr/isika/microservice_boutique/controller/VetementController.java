package fr.isika.microservice_boutique.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import fr.isika.microservice_boutique.model.Vetements;
import reactor.core.publisher.Flux;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/boutique")
public class VetementController {
	
	private WebClient client = WebClient.create("https://africaparis-nodejs.herokuapp.com");

	@GetMapping(path = "/boutique-api/public/articles") 
	public Flux<Vetements> getVetements() {
		return client.get().uri("/boutique-api/public/articles").accept(MediaType.APPLICATION_JSON).retrieve()
				.bodyToFlux(Vetements.class).log("retrieve emps :: ");
	}
}
