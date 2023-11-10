package com.example.demo.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "departamentos")
public class Departamento {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private int presupuesto;
	
	@OneToMany
	@JoinColumn(name="departamento_id")
	private List<Empleado> empleado;

	public Departamento(Long id, String nombre, int presupuesto, List<Empleado> empleado) {
		//super();
		this.id = id;
		this.nombre = nombre;
		this.presupuesto = presupuesto;
		this.empleado = empleado;
	}
	
	public Departamento() {
		//super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(int presupuesto) {
		this.presupuesto = presupuesto;
	}

	public List<Empleado> getEmpleado() {
		return empleado;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy="Articulo")
	public void setEmpleado(List<Empleado> empleado) {
		this.empleado = empleado;
	}

	@Override
	public String toString() {
		return "Departamento [id=" + id + ", nombre=" + nombre + ", presupuesto=" + presupuesto + ", empleado="
				+ empleado + "]";
	}
}