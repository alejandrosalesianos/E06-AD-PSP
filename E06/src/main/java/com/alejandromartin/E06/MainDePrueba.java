package com.alejandromartin.E06;

import com.alejandromartin.E06.model.Categoria;
import com.alejandromartin.E06.model.Producto;
import com.alejandromartin.E06.services.CategoriaService;
import com.alejandromartin.E06.services.ProductoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class MainDePrueba {

    private final CategoriaService categoriaService;
    private final ProductoService productoService;

    @PostConstruct
    public void prueba(){

        Categoria fruta = Categoria.builder()
                .nombre("Frutas")
                .productos(new ArrayList<>())
                .build();
        categoriaService.save(fruta);
        Categoria congelados = Categoria.builder()
                .nombre("congelados")
                .build();
        categoriaService.save(congelados);
        Categoria pescado = Categoria.builder()
                .nombre("Pescado")
                .build();
        categoriaService.save(pescado);

        Producto producto1 = Producto.builder()
                .nombre("Atún")
                .pvp(3.67)
                .build();
        productoService.save(producto1);
        producto1.addCategoria(pescado);
        Producto producto2 = Producto.builder()
                .nombre("Patatas Fritas")
                .pvp(2.00)
                .build();
        productoService.save(producto2);
        producto2.addCategoria(congelados);
        Producto producto3 = Producto.builder()
                .nombre("Pera")
                .pvp(1.89)
                .build();
        productoService.save(producto3);
        producto3.addCategoria(fruta);

        Producto producto4 = Producto.builder()
                .nombre("Manzana")
                .pvp(2.00)
                .build();
        productoService.save(producto4);
        producto4.addCategoria(fruta);

        System.out.println("categoria: "+fruta.getNombre());
        System.out.println("Productos disponibles:");
        fruta.getProductos().forEach(p -> {
            System.out.println(p.getNombre() + " "+p.getPvp()+ " euros");
        });
        System.out.println("\ncategoria: "+congelados.getNombre());
        System.out.println("Productos disponibles:");
        congelados.getProductos().forEach(p -> {
            System.out.println(p.getNombre() + " "+p.getPvp()+ " euros");
        });
        System.out.println("\ncategoria: "+pescado.getNombre());
        System.out.println("Productos disponibles:");
        pescado.getProductos().forEach(p -> {
            System.out.println(p.getNombre() + " "+p.getPvp()+ " euros");
        });

    }
}
