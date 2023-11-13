package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IDepartamentoDAO;
import com.example.demo.dto.Departamento;

@Service
public class DepartamentoServiceImpl implements IDepartamentoService{

	@Autowired
	private IDepartamentoDAO departamentoDAO;
	

	public List<Departamento> findAll() {
		return departamentoDAO.findAll();
	}
	
	public Departamento findById(Long id) {
		return departamentoDAO.findById(id).get();
	}
	
	public Departamento save(Departamento articulo) {
		return departamentoDAO.save(articulo);
	}
	
	public Departamento update(Departamento articulo) {
		return departamentoDAO.save(articulo);
	}
	
	public void delete(Long id) {
		departamentoDAO.deleteById(id);
	}
}