package com.academy.gama.projeto.adocao.repository;

import com.academy.gama.projeto.adocao.model.entity.Pet;
import com.academy.gama.projeto.adocao.model.entity.PetColor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long> {

}
