package com.uce.edu.demo.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.ICitaMedicaRepository;
import com.uce.edu.demo.repository.modelo.CitaMedica;

@Service
public class CitaMedicaServiceImpl implements ICitaMedicaService {

	@Autowired
	private ICitaMedicaRepository citaMedicaRepository;
	
	@Override
	public void insertar(CitaMedica cita) {
		// TODO Auto-generated method stub
		this.citaMedicaRepository.insertar(cita);
	}
	
	@Override
	public void actualizar(String numero, String diagnostico, String receta, LocalDateTime fechaProximaCita) {
		// TODO Auto-generated method stub
		this.citaMedicaRepository.actualizar(numero, diagnostico, receta, fechaProximaCita);
	}

}
