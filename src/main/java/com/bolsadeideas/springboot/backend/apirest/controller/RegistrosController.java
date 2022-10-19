package com.bolsadeideas.springboot.backend.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bolsadeideas.springboot.backend.apirest.model.entity.Registros;
import com.bolsadeideas.springboot.backend.apirest.model.service.IRegistrosService;

@RestController
@RequestMapping("/restfull")
public class RegistrosController {

	@Autowired
	private IRegistrosService serviceRegistros;
	
	@GetMapping("/registros")
	public List<Registros> buscarTodos(){
		return serviceRegistros.buscarTodos();
	}
	
	@PostMapping("/registros")
	public Registros guardar(@RequestBody Registros registro) {
		serviceRegistros.guardar(registro);
		return registro;
	}
}
