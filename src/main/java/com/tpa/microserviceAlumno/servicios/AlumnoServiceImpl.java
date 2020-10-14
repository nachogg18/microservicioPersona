package com.tpa.microserviceAlumno.servicios;


import com.tpa.microserviceAlumno.entidades.Alumno;
import com.tpa.microserviceAlumno.repositorios.BaseRepository;
import com.tpa.microserviceAlumno.repositorios.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class AlumnoServiceImpl extends BaseServiceImpl<Alumno, Long> implements AlumnoService {

    @Autowired
    private AlumnoRepository alumnoRepository;

    public AlumnoServiceImpl(BaseRepository<Alumno, Long> baseRepository, AlumnoRepository alumnoRepository) {
        super(baseRepository);
    }

    @Override
    public List<Alumno> search(String filtro) throws Exception {
        try {


            List<Alumno> alumnos = alumnoRepository.search(filtro);

            return alumnos;
        } catch (Exception e ) {
            throw new Exception(e.getMessage());
        }
    }
}
