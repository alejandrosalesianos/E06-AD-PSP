package com.alejandromartin.E06.services;

import com.alejandromartin.E06.model.Categoria;
import com.alejandromartin.E06.repos.CategoriaRepository;
import com.alejandromartin.E06.services.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService extends BaseService<Categoria,Long, CategoriaRepository> {
}
