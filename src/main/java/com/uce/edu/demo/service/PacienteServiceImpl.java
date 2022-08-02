package com.uce.edu.demo.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.IPacienteRepository;
import com.uce.edu.demo.repository.modelo.Paciente;
import com.uce.edu.demo.repository.to.PacienteSencillo;

@Service
public class PacienteServiceImpl implements IPacienteService {

	@Autowired
	private IPacienteRepository pacienteRepository;
	
	@Override
	public void insertar(Paciente paciente) {
		// TODO Auto-generated method stub
		this.pacienteRepository.insertar(paciente);
	}

	@Override
	public Paciente buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.pacienteRepository.buscarPorId(id);
	}

	@Override
	public Paciente buscarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.pacienteRepository.buscarPorCedula(cedula);
	}
	
	@Override
	public List<PacienteSencillo> reporteEficiente(LocalDateTime fecha, String genero) {
		// TODO Auto-generated method stub
		return this.pacienteRepository.reporteEficiente(fecha, genero);
	}

	@Override
	public void actualizar(Paciente paciente) {
		// TODO Auto-generated method stub
		this.pacienteRepository.actualizar(paciente);
	}

	@Override
	public void eliminarPorId(Integer id) {
		// TODO Auto-generated method stub
		this.pacienteRepository.eliminarPorId(id);
	}

}
