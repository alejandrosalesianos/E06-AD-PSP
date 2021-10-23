package com.alejandromartin.E06.repos;

import com.alejandromartin.E06.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria,Long> {
}
