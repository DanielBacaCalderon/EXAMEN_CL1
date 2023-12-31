package com.cibertec.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "empleado")
public class Empleado {
	@Id
	private String IdEmpleado;
	private String Apellidos;
	private String Nombres;
	private int Edad;
	private String Sexo;
	private double Salario;
	
	public Empleado() {
		
	}
	
	public Empleado(String idEmpleado, String apellidos, String nombres, int edad, String sexo, double salario) {
		super();
		IdEmpleado = idEmpleado;
		Apellidos = apellidos;
		Nombres = nombres;
		Edad = edad;
		Sexo = sexo;
		Salario = salario;
	}
	//metodos de Acceso SET y GET
	
	public String getIdEmpleado() {
		return IdEmpleado;
	}
	public void setIdEmpleado(String idEmpleado) {
		IdEmpleado = idEmpleado;
	}
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	public String getNombres() {
		return Nombres;
	}
	public void setNombres(String nombres) {
		Nombres = nombres;
	}
	public int getEdad() {
		return Edad;
	}
	public void setEdad(int edad) {
		Edad = edad;
	}
	public String getSexo() {
		return Sexo;
	}
	public void setSexo(String sexo) {
		Sexo = sexo;
	}
	public double getSalario() {
		return Salario;
	}
	public void setSalario(double salario) {
		Salario = salario;
	}
	
	
	
}
