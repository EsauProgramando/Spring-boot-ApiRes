package com.bolsadeideas.springboot.backend.apirest.model.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bolsadeideas.springboot.backend.apirest.model.entity.Registros;
import com.bolsadeideas.springboot.backend.apirest.model.repository.RegistrosRepository;
import com.bolsadeideas.springboot.backend.apirest.model.service.IRegistrosService;

@Service
public class RegistrosService implements IRegistrosService {

	@Autowired
	private RegistrosRepository repoRegistros;

	@Override
	public List<Registros> buscarTodos() {

		return (List<Registros>) repoRegistros.findAll();// retornamos del mismo tipo (Registros)
	}

	@Override
	public void guardar(Registros registro) {
		repoRegistros.save(registro);	
	}

}
