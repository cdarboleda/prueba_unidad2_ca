package com.uce.edu.demo.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.repository.modelo.Paciente;
import com.uce.edu.demo.repository.to.PacienteSencillo;

public interface IPacienteRepository {
	public void insertar(Paciente paciente);
	public Paciente buscarPorId(Integer id);
	public Paciente buscarPorCedula(String cedula);
	public List<PacienteSencillo> reporteEficiente(LocalDateTime fecha, String genero);
	public void actualizar(Paciente paciente);
	public void eliminarPorId(Integer id);
}
