package com.uce.edu.demo.repository;

import com.uce.edu.demo.repository.modelo.Paciente;

public interface IPacienteRepository {
	public void insertar(Paciente paciente);
	public Paciente buscarPorId(Integer id);
	public Paciente buscarPorCedula(String cedula);
	public void actualizar(Paciente paciente);
	public void eliminarPorId(Integer id);
}
