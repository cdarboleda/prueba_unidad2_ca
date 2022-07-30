package com.uce.edu.demo.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.ICitaMedicaRepository;
import com.uce.edu.demo.repository.IDoctorRepository;
import com.uce.edu.demo.repository.IPacienteRepository;
import com.uce.edu.demo.repository.modelo.CitaMedica;
import com.uce.edu.demo.repository.modelo.Doctor;
import com.uce.edu.demo.repository.modelo.Paciente;
import com.uce.edu.demo.repository.to.PacienteSencillo;

@Service
public class GestorCitaServiceImpl implements IGestorCitaService {

	@Autowired
	private ICitaMedicaRepository citaMedicaRepository;
	
	@Autowired
	private IDoctorRepository doctorRepository;
	
	@Autowired
	private IPacienteRepository pacienteRepository;
	
	
	@Override
	public void agendar(String numero, LocalDateTime fecha, BigDecimal valor, String lugar, String cedulaDoctor,
			String cedulaPaciente) {
		// TODO Auto-generated method stub
		Doctor d = this.doctorRepository.buscarPorCedula(cedulaDoctor);
		Paciente p = this.pacienteRepository.buscarPorCedula(cedulaPaciente);
		
		CitaMedica c = new CitaMedica();
		c.setNumero(numero);
		c.setFechaCita(fecha);
		c.setValorCita(valor);
		c.setLugarCita(lugar);
		c.setPaciente(p);
		c.setDoctor(d);
		
		this.citaMedicaRepository.insertar(c);
	}

	@Override
	public CitaMedica buscarPorNumero(String numero) {
		// TODO Auto-generated method stub
		
		return this.citaMedicaRepository.buscarPorNumero(numero);
	}

	@Override
	public List<PacienteSencillo> reporteEficiente(LocalDateTime fecha, String genero) {
		// TODO Auto-generated method stub
		return this.citaMedicaRepository.reporteEficiente(fecha, genero);
	}

	@Override
	public void actualizar(String numero, String diagnostico, String receta, LocalDateTime fechaProximaCita) {
		// TODO Auto-generated method stub
		this.citaMedicaRepository.actualizar(numero, diagnostico, receta, fechaProximaCita);
	}



}
