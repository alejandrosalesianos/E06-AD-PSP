package com.alejandromartin.E062.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@NoArgsConstructor @AllArgsConstructor @Builder
@Getter @Setter
public class Video {

    @Id
    @GeneratedValue
    private Long id;

    private int orden;

    private String titulo;

    private String descripcion;

    private String url;

    @ManyToOne
    private CursoOnline cursoOnline;
}
