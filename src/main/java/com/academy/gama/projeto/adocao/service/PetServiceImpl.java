package com.academy.gama.projeto.adocao.service;

import com.academy.gama.projeto.adocao.model.dto.CreatePetDto;
import com.academy.gama.projeto.adocao.model.entity.*;
import com.academy.gama.projeto.adocao.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PetServiceImpl implements PetService {

    @Autowired
    public PetRepository petRepository;

    @Autowired
    public PetSexRepository petSexRepository;

    @Autowired
    public PetColorRepository petColorRepository;

    @Autowired
    public PetSizeRepository petSizeRepository;

    @Autowired
    public PetTypeRepository petTypeRepository;

        @Override
        public Pet createPet(CreatePetDto pet){
            PetSize petSize = petSizeRepository.findByDescription(pet.getPetSize());
            PetColor petColor = petColorRepository.findByDescription(pet.getColor());
            PetSex petSex = petSexRepository.findByDescription(pet.getSex());
            PetType petType = petTypeRepository.findByDescription(pet.getPetType());

            Pet petEntity = Pet.builder()
                    .name(pet.getName())
                    .petType(petType)
                    .petSize(petSize)
                    .color(petColor)
                    .sex(petSex)
                    .age(pet.getAge())
                    .build();

            Pet petCreate = petRepository.save(petEntity);
            return petCreate;
    }
}
