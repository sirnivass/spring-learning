package com.devsuperior.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dtos.CategoryDTO;
import com.devsuperior.services.CategoryService;

@RestController
@RequestMapping("/api")
public class CategoryController {

    //Assim como detalhei em CategoryService meu controller "chama" uma instância de service que trás consigo os métodos que lá constam.
    private final CategoryService service;
    
    public CategoryController(CategoryService service){
        this.service = service;
    }
    
    @GetMapping
    public ResponseEntity<List<CategoryDTO>> findAll(){
        List<CategoryDTO> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
}
