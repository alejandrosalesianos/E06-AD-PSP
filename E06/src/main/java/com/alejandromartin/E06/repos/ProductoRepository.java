package com.alejandromartin.E06.repos;

import com.alejandromartin.E06.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto,Long> {
}
