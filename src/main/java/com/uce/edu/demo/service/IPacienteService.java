package com.uce.edu.demo.service;

import com.uce.edu.demo.repository.modelo.Paciente;

public interface IPacienteService {
	public void insertar(Paciente paciente);
	public Paciente buscarPorId(Integer id);
	public Paciente buscarPorCedula(String cedula);
	public void actualizar(Paciente paciente);
	public void eliminarPorId(Integer id);
}
