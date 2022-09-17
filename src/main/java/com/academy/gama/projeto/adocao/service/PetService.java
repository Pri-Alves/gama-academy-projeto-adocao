package com.academy.gama.projeto.adocao.service;

import com.academy.gama.projeto.adocao.model.dto.CreatePetDto;
import com.academy.gama.projeto.adocao.model.entity.Pet;

public interface PetService {
    Pet createPet(CreatePetDto pet);
}
