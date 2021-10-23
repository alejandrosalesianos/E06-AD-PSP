package com.alejandromartin.E06.services;

import com.alejandromartin.E06.model.Producto;
import com.alejandromartin.E06.repos.ProductoRepository;
import com.alejandromartin.E06.services.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class ProductoService extends BaseService<Producto,Long, ProductoRepository> {
}
