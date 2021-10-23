package com.alejandromartin.E062.services;

import com.alejandromartin.E062.model.Profesor;
import com.alejandromartin.E062.repos.ProfesorRepository;
import com.alejandromartin.E062.services.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class ProfesorService extends BaseService<Profesor,Long, ProfesorRepository> {
}
