package com.tpa.microserviceAlumno.servicios;

import com.tpa.microserviceAlumno.entidades.Alumno;

import java.util.List;


public interface AlumnoService extends BaseService<Alumno, Long> {
    List<Alumno> search(String filtro) throws Exception;
}
