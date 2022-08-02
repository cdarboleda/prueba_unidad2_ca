package com.uce.edu.demo.service;

import java.time.LocalDateTime;

import com.uce.edu.demo.repository.modelo.CitaMedica;

public interface ICitaMedicaService {
	public void insertar(CitaMedica cita);
	public void actualizar(String numero, String diagnostico, String receta, LocalDateTime fechaProximaCita);
}
