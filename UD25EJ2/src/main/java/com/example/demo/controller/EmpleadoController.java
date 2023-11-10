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

import com.example.demo.dto.Empleado;
import com.example.demo.service.EmpleadoServiceImpl;

@Controller
@RequestMapping("/empleado")
public class EmpleadoController {

	@Autowired
	EmpleadoServiceImpl empladoService;
	
	@GetMapping("/all")
	public List<Empleado> getAll() {
		return empladoService.findAll();
	}
	
	@GetMapping("/{id}")
	public Empleado getById(@PathVariable(name="id") String id) {
		return empladoService.findById(id);
	}
	
	
	@PostMapping("")
	public Empleado create(@RequestBody Empleado articulo) {
		return empladoService.save(articulo);
	}
	
	@PutMapping("/{id}")
	public Empleado update(@PathVariable(name="id")String id,@RequestBody Empleado empleado) {
		
		Empleado articuloSeleccionado= new Empleado();
		
		articuloSeleccionado= empladoService.findById(id);
		
		articuloSeleccionado.setNombre(empleado.getNombre());
		articuloSeleccionado.setApellidos(empleado.getApellidos());
		
		articuloSeleccionado = empladoService.update(articuloSeleccionado);
		
		return articuloSeleccionado;
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable(name="id") String id) {
		empladoService.delete(id);
	}
}