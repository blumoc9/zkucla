package com.sigarep.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sigarep.modelo.Profesor;

public interface IProfesorRepositorio extends JpaRepository<Profesor,String> {
  
}
