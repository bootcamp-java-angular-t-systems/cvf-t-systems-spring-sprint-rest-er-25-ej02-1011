package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IEmpleadoDAO;
import com.example.demo.dto.Empleado;

@Service
public class EmpleadoServiceImpl {

	@Autowired
	private IEmpleadoDAO empleadoDAO;

	public List<Empleado> findAll() {
		return empleadoDAO.findAll();
	}

	public Empleado findById(String id) {
		return empleadoDAO.findById(id).get();
	}

	public Empleado save(Empleado empleado) {
		return empleadoDAO.save(empleado);
	}

	public Empleado update(Empleado empleado) {
		return empleadoDAO.save(empleado);
	}

	public void delete(String id) {
		empleadoDAO.deleteById(id);
	}
}