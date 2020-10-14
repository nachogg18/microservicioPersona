package com.tpa.microserviceAlumno.repositorios;

import java.util.List;

import com.tpa.microserviceAlumno.entidades.Alumno;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AlumnoRepository extends BaseRepository<Alumno, Long> {
	@Query(value = "SELECT a FROM Alumno a WHERE a.nombre LIKE %:filtro% OR a.apellido LIKE %:filtro%")
	List<Alumno> search(@Param("filtro") String filtro);
}
