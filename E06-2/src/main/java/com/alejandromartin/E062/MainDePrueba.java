package com.alejandromartin.E062;

import com.alejandromartin.E062.model.CursoOnline;
import com.alejandromartin.E062.model.Profesor;
import com.alejandromartin.E062.model.Video;
import com.alejandromartin.E062.services.CursoOnlineService;
import com.alejandromartin.E062.services.ProfesorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class MainDePrueba {

    private final CursoOnlineService cursoOnlineService;
    private final ProfesorService profesorService;

    @PostConstruct
    public void prueba(){

        //Creamos los profesores
        Profesor luismi = Profesor.builder()
                .nombre("Luismi")
                .email("luismi@gmail.com")
                .puntuacion(5)
                .build();
        profesorService.save(luismi);
        Profesor miguel = Profesor.builder()
                .nombre("miguel")
                .email("miguel@gmail.com")
                .puntuacion(4.5)
                .build();
        profesorService.save(miguel);

        //Creamos los cursos online
        CursoOnline springDataJPA = CursoOnline.builder()
                .nombre("SpringDataJPA")
                .puntuacion(5)
                .videos(new ArrayList<>())
                .build();
        cursoOnlineService.save(springDataJPA);
        CursoOnline androidStudio = CursoOnline.builder()
                .nombre("AndroidStudio")
                .puntuacion(5)
                .videos(new ArrayList<>())
                .build();
        cursoOnlineService.save(androidStudio);
        springDataJPA.addVideo(Video.builder()
                .orden(1)
                .titulo("Introduccion a SpringDataJPA")
                .descripcion("El mejor video del mundo")
                .url("htps://SpringDataJPA.com")
                .build());
        cursoOnlineService.edit(springDataJPA);

        androidStudio.addVideo(Video.builder()
                .orden(1)
                .titulo("Introduccion a AndroidStudio")
                .descripcion("El mejor video del mundo")
                .url("htps://AndroidStudio.com")
                .build());
        cursoOnlineService.edit(androidStudio);
        //Añadimos a los profesores a los cursos
        springDataJPA.addProfesor(luismi);
        androidStudio.addProfesor(miguel);

        cursoOnlineService.edit(springDataJPA);
        cursoOnlineService.edit(androidStudio);

        List<CursoOnline> resultado = cursoOnlineService.findAll();

        System.out.println("Profesor: " + luismi.getNombre());
        System.out.println("Cursos online: ");
        luismi.getCursosOnline().forEach(c -> {
            System.out.println(c.getNombre());
        });
        System.out.println("Videos: ");
        springDataJPA.getVideos().forEach(v -> {
            System.out.println(v.getTitulo());
        });

        System.out.println("Profesor: " + miguel.getNombre());
        System.out.println("Cursos online: ");
        miguel.getCursosOnline().forEach(c -> {
            System.out.println(c.getNombre());
        });
        System.out.println("Videos: ");
        androidStudio.getVideos().forEach(v -> {
            System.out.println(v.getTitulo());
        });

    }
}
