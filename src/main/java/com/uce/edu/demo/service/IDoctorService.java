package com.uce.edu.demo.service;

import com.uce.edu.demo.repository.modelo.Doctor;

public interface IDoctorService {
	public void insertar(Doctor doctor);
	public Doctor buscarPorId(Integer id);
	public Doctor buscarPorCedula(String cedula);
	public void actualizar(Doctor doctor);
	public void eliminarPorId(Integer id);
}
