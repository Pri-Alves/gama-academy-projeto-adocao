package com.academy.gama.projeto.adocao.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class CreatePetDto {

    private String name;
    private String petType;
    private String petSize;
    private String color;
    private String sex;
    private Integer age;
}
