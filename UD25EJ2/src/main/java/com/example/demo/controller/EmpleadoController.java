package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Empleado;
import com.example.demo.service.EmpleadoServiceImpl;

@RestController
@RequestMapping("/empleado")
public class EmpleadoController {

	@Autowired
	EmpleadoServiceImpl empladoService;

	@GetMapping("/all")
	public List<Empleado> getAll() {
		return empladoService.findAll();
	}

	@GetMapping("/{id}")
	public Empleado getById(@PathVariable(name = "id") String id) {
		return empladoService.findById(id);
	}

	@PostMapping("")
	public Empleado create(@RequestBody Empleado emplado) {
		return empladoService.save(emplado);
	}

	@PutMapping("/{id}")
	public Empleado update(@PathVariable(name = "id") String id, @RequestBody Empleado empleado) {

		Empleado empladoSeleccionado = new Empleado();

		empladoSeleccionado = empladoService.findById(id);

		empladoSeleccionado.setNombre(empleado.getNombre());
		empladoSeleccionado.setApellidos(empleado.getApellidos());
		empladoSeleccionado.setDepartamento(empleado.getDepartamento());

		empladoSeleccionado = empladoService.update(empladoSeleccionado);

		return empladoSeleccionado;
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable(name = "id") String id) {
		empladoService.delete(id);
	}
}