package com.academy.gama.projeto.adocao.repository;

import com.academy.gama.projeto.adocao.model.entity.Adopter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdopterRepository extends JpaRepository<Adopter, Long> {

}
