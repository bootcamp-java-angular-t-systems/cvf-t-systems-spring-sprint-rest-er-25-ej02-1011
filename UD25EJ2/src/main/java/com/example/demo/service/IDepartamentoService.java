package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Departamento;

public interface IDepartamentoService {
	
	public List<Departamento> findAll();

	public Departamento findById(int id);

	public Departamento update(Departamento articulo);

	public Departamento save(Departamento departamento);

	public void delete(int id);

}
