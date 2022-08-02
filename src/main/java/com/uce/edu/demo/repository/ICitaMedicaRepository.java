package com.uce.edu.demo.repository;

import java.time.LocalDateTime;

import com.uce.edu.demo.repository.modelo.CitaMedica;

public interface ICitaMedicaRepository {
	public void insertar(CitaMedica cita);
	public CitaMedica buscarPorNumero(String numero);
	public void actualizar(String numero, String diagnostico, String receta, LocalDateTime fechaProximaCita);
}
