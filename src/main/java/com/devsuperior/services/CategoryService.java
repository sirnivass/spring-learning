package com.devsuperior.services;


import java.util.List;

import org.springframework.stereotype.Service;

import com.devsuperior.models.Category;
import com.devsuperior.repositories.CategoryRepository;

@Service
public class CategoryService {

    private final CategoryRepository repository; //Preciso de uma instancia de repository aqui em services para que, o service tenha acesso aos métodos
    // o atributo repository não pode ser alterado após ser atribuído. 
    //Isso significa que, uma vez que o objeto CategoryRepositories seja injetado no construtor, ele não poderá ser substituído por outro objeto
    public CategoryService(CategoryRepository repository) {
        this.repository = repository;
        //Atribui o valor do parâmetro (CategoryRepository) ao atributo (repository).
    }
    //A partir desse momento repository possui
    //findAll(), findById(Long id), save(Category entity), deleteById(Long id)...

    /* 
    * Como faço para que esse método consiga acessar o Repository e chamar lá no BD as categorias?
    * Para tanto, preciso injetar uma dependencia aqui no service do Repository
    */
    public List<Category> findAll(){ 
        return repository.findAll(); //Aqui consigo ver os métodos JPA que repository herdou
        
    }
}
