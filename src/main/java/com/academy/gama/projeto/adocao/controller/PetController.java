package com.academy.gama.projeto.adocao.controller;

import com.academy.gama.projeto.adocao.model.entity.Pet;
import com.academy.gama.projeto.adocao.model.dto.CreatePetDto;
import com.academy.gama.projeto.adocao.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PetController {

    @Autowired(required=true)
    private PetService petService;

    @PostMapping("/pet")
    public ResponseEntity<Pet> create(@RequestBody CreatePetDto pet) {
        return ResponseEntity.ok(petService.createPet(pet));
    }

    @GetMapping("/pet/{id}")
    public ResponseEntity<Pet> getPet(){
        Pet pet2 =  Pet.builder().name("carv").build();
        return ResponseEntity.ok(pet2);
    }

}
