package com.uce.edu.demo.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.repository.modelo.CitaMedica;
import com.uce.edu.demo.repository.to.PacienteSencillo;

public interface ICitaMedicaRepository {
	public void insertar(CitaMedica cita);
	public CitaMedica buscarPorNumero(String numero);
	public List<PacienteSencillo> reporteEficiente(LocalDateTime fecha, String genero);
	public void actualizar(String numero, String diagnostico, String receta, LocalDateTime fechaProximaCita);
}
