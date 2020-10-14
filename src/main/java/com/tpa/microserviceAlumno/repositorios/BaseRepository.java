package com.tpa.microserviceAlumno.repositorios;

import java.io.Serializable;

import com.tpa.microserviceAlumno.entidades.Base;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseRepository<E extends Base, ID extends Serializable> 
    extends JpaRepository<E, ID> {
}
