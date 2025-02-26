package com.devsuperior.dtos;

import com.devsuperior.models.Category;

public class CategoryDTO {

    private Long id;
    private String name;

    public CategoryDTO(){}//exigência do H2

    public CategoryDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    //recebe um objeto Category como parâmetro tem como função facilitar a conversão de uma entidade do modelo de domínio (Category) 
    //para um objeto de transferência de dados (CategoryDTO).
    public CategoryDTO(Category category) {
        id = category.getId();
        name = category.getName();
    }



    
}
