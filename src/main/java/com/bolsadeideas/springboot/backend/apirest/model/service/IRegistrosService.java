package com.bolsadeideas.springboot.backend.apirest.model.service;

import java.util.List;

import com.bolsadeideas.springboot.backend.apirest.model.entity.Registros;

public interface IRegistrosService {
	
 public List<Registros> buscarTodos(); //Método para listar todos los registros
 
 public void guardar(Registros registro);// Método para guardar un registro
}
