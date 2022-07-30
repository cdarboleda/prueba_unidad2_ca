package com.uce.edu.demo.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.repository.modelo.CitaMedica;
import com.uce.edu.demo.repository.to.PacienteSencillo;

public interface IGestorCitaService {
	public void agendar(String numero, LocalDateTime fecha, BigDecimal valor, String lugar, String cedulaDoctor, String cedulaPaciente);
	public CitaMedica buscarPorNumero(String numero);
	public List<PacienteSencillo> reporteEficiente(LocalDateTime fecha, String genero);
	public void actualizar(String numero, String diagnostico, String receta, LocalDateTime fechaProximaCita);

}
