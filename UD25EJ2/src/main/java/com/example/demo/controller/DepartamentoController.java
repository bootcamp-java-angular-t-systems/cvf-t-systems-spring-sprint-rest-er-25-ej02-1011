package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.Departamento;
import com.example.demo.service.DepartamentoServiceImpl;

@Controller
@RequestMapping("/departamento")
public class DepartamentoController {

	@Autowired
	DepartamentoServiceImpl departamentoService;

	@GetMapping("/all")
	public List<Departamento> getAll() {
		return departamentoService.findAll();
	}

	@GetMapping("/{id}")
	public Departamento getById(@PathVariable(name = "id") Long id) {
		return departamentoService.findById(id);
	}

	@PostMapping("")
	public Departamento createDepartamento(@RequestBody Departamento articulo) {
		return departamentoService.save(articulo);
	}

	@PutMapping("/{id}")
	public Departamento updateDepartamento(@PathVariable(name = "id") Long id, @RequestBody Departamento departamento) {

		Departamento departamentoSeleccionado = new Departamento();

		departamentoSeleccionado = departamentoService.findById(id);

		departamentoSeleccionado.setNombre(departamento.getNombre());
		departamentoSeleccionado.setPresupuesto(departamento.getPresupuesto());

		departamentoSeleccionado = departamentoService.update(departamentoSeleccionado);

		return departamentoSeleccionado;
	}

	@DeleteMapping("/{id}")
	public void deleteArticulo(@PathVariable(name = "id") Long id) {
		departamentoService.delete(id);
	}
}