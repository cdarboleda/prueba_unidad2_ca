package com.uce.edu.demo.repository;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.repository.modelo.Paciente;
import com.uce.edu.demo.repository.to.PacienteSencillo;

@Repository
@Transactional
public class PacienteRepositoryImpl implements IPacienteRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Paciente paciente) {
		// TODO Auto-generated method stub
		this.entityManager.persist(paciente);
	}

	@Override
	public Paciente buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Paciente.class, id);
	}

	@Override
	public Paciente buscarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		String sql ="SELECT p FROM Paciente p WHERE p.cedula = :cedula";
		TypedQuery<Paciente> myQuery = this.entityManager.createQuery(sql, Paciente.class);
		myQuery.setParameter("cedula", cedula);
		return myQuery.getSingleResult();
	}
	
	@Override
	public List<PacienteSencillo> reporteEficiente(LocalDateTime fecha, String genero) {
		// TODO Auto-generated method stub
		String sql = "SELECT NEW com.uce.edu.demo.repository.to.PacienteSencillo(p.cedula, p.nombre, p.fechaNacimiento, p.genero) "
				+ "FROM Paciente p WHERE p.fechaNacimiento > :fecha AND p.genero = :genero";
		TypedQuery<PacienteSencillo> myQuery = this.entityManager.createQuery(sql, PacienteSencillo.class);
		myQuery.setParameter("fecha", fecha);
		myQuery.setParameter("genero", genero);
		
		return myQuery.getResultList();
	}

	@Override
	public void actualizar(Paciente paciente) {
		// TODO Auto-generated method stub
		this.entityManager.merge(paciente);
	}

	@Override
	public void eliminarPorId(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(buscarPorId(id));
	}

}
