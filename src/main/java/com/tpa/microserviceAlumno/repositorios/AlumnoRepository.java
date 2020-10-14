package com.tpa.microserviceAlumno.repositorios;

import com.tpa.microserviceAlumno.entidades.Alumno;

import org.springframework.stereotype.Repository;

@Repository
public interface AlumnoRepository extends BaseRepository<Alumno, Long> {
}
