package com.tpa.microserviceAlumno.controladores;

import com.tpa.microserviceAlumno.entidades.Alumno;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/alumno")

public class AlumnoController extends BaseControllerImpl<Alumno, AlumnoServiceImpl> {
}