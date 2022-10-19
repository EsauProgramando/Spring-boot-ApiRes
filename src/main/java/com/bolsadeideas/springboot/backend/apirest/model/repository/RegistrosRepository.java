package com.bolsadeideas.springboot.backend.apirest.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bolsadeideas.springboot.backend.apirest.model.entity.Registros;

public interface RegistrosRepository extends JpaRepository<Registros, Integer> {

}
