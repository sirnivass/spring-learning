package com.devsuperior.services;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dtos.CategoryDTO;
import com.devsuperior.models.Category;
import com.devsuperior.repositories.CategoryRepository;

@Service
public class CategoryService {


    private final CategoryRepository repository; 

    public CategoryService(CategoryRepository repository) {
        this.repository = repository;
    }

    @Transactional(readOnly = true)
    public List<CategoryDTO> findAll(){ 
        List<Category> list = repository.findAll();
        return list.stream()
            .map(CategoryDTO::new)
            .collect(Collectors.toList());
    }
    /*  
    @Transactional(readOnly = true)
    public List<CategoryDTO> findAll(){ 
    //Essa fincao espera um reotorno do tipo lista
    //O tipo da Lista é um DTO
    //Mas, o Service só trabalha com model
    //Então declaramos uma lista de Category:
        List<Category> list = repository.findAll();
    //Após declarado, vamos usar stream map para converter em DTO
        List<CategoryDTO> listDto = list.stream()//stream permite trabalhar com funcoes de alta ordem [Lambda, nesse caso vamos trabalhar com map]
        .map(x - > new CategoryDTO(x)) //stream aplica uma funcao a cada elemento da nossa lista[nesse caso específico]
        .collect(Collectors.toList()); //após transformar lista num map, temos que voltar para lista, usando collect
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // Resumindo:
    @Transactional(readOnly = true)
    public List<CategoryDTO> findAll(){ 
        List<Category> list = repository.findAll();
        return list.stream().map(x - > new CategoryDTO(x)).collect(Collectors.toList());
        //Antes, eu declarava a lista, fazia a conversao e depois reotrnava a lista, agora já retorno direto.

    @Transactional(readOnly = true)
    public List<CategoryDTO> findAll(){ 
        List<Category> list = repository.findAll();
        
        List<CategoryDTO> listDto = new ArrayList<>();
        for (Category cat : list){
        listDto.add(new CategoryDTO(cat));

        return listDto; 
        }
    */
}
