package com.alejandromartin.E062.services;

import com.alejandromartin.E062.model.CursoOnline;
import com.alejandromartin.E062.repos.CursoOnlineRepository;
import com.alejandromartin.E062.services.base.BaseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoOnlineService extends BaseService<CursoOnline,Long, CursoOnlineRepository> {


    @Override
    public List<CursoOnline> findAll() {
        return this.repositorio.findAllJoin();
    }
}
