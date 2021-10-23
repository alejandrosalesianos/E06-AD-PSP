package com.alejandromartin.E062.repos;

import com.alejandromartin.E062.model.CursoOnline;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CursoOnlineRepository extends JpaRepository<CursoOnline,Long> {

    @Query("select distinct c from CursoOnline c join fetch c.videos")
    List<CursoOnline> findAllJoin();

}
