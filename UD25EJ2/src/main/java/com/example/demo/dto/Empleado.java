package com.example.demo.dto;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="empleados")
public class Empleado {

	@Id
	@Column(name="dni")
	private String id;
	private String nombre;
	private String apellidos;
	
	@ManyToOne
	@JoinColumn(name="departamento_id")
	private Departamento departamentos;

	public Empleado(String id, String nombre, String apellidos, Departamento departamento) {
		//super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.departamentos = departamento;
	}

	public Empleado() {
		//super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Departamento getDepartamento() {
		return departamentos;
	}

	public void setDepartamento(Departamento departamentos) {
		this.departamentos = departamentos;
	}

	@Override
	public String toString() {
		return "empleado [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", departamentos="
				+ departamentos + "]";
		
	}
	
	
}