package com.uce.edu.demo.repository;

import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.repository.modelo.CitaMedica;

@Repository
@Transactional
public class CitaMedicaRepository implements ICitaMedicaRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(CitaMedica cita) {
		// TODO Auto-generated method stub
		this.entityManager.persist(cita);
	}
	
	@Override
	public CitaMedica buscarPorNumero(String numero) {
		// TODO Auto-generated method stub
		String sql = "SELECT c FROM CitaMedica c WHERE c.numero = numero";
		TypedQuery<CitaMedica> myQuery = this.entityManager.createQuery(sql, CitaMedica.class);
		return myQuery.getSingleResult();
	}
	
	@Override
	public void actualizar(String numero, String diagnostico, String receta, LocalDateTime fechaProximaCita) {
		// TODO Auto-generated method stub
		String sql ="UPDATE CitaMedica c SET c.diagnostico = :diagnostico, c.receta = :receta, c.fechaProximaCita = :fechaProximaCita "
				+ "WHERE c.numero = :numero";
		Query myQuery = this.entityManager.createQuery(sql);
		myQuery.setParameter("diagnostico", diagnostico);
		myQuery.setParameter("receta", receta);
		myQuery.setParameter("fechaProximaCita", fechaProximaCita);
		myQuery.setParameter("numero", numero);
		myQuery.executeUpdate();
	}

}
