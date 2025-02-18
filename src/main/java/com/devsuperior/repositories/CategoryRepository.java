package com.devsuperior.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.models.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{


}
