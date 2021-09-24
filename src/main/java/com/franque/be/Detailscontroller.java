package com.franque.be;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Detailscontroller {

	@GetMapping("/details")
	public PersonalDetails getDetails() {
		return new PersonalDetails("Franque", "Parola");
	}
}
