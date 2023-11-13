package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Empleado;

public interface IEmpleadoService {
	public List<Empleado> findAll();

	public Empleado findById(String id);

	public Empleado update(Empleado empleado);

	public Empleado save(Empleado empleado);

	public void delete(String id);

}