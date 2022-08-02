package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.repository.modelo.Doctor;
import com.uce.edu.demo.repository.modelo.Paciente;
import com.uce.edu.demo.repository.to.PacienteSencillo;
import com.uce.edu.demo.service.ICitaMedicaService;
import com.uce.edu.demo.service.IDoctorService;
import com.uce.edu.demo.service.IGestorCitaService;
import com.uce.edu.demo.service.IPacienteService;

@SpringBootApplication
public class PruebaUnidad2CaApplication implements CommandLineRunner{

	@Autowired
	private IDoctorService doctorService;
	
	@Autowired
	private IPacienteService pacienteService;
	
	@Autowired
	private IGestorCitaService gestorCitaService;
	
	@Autowired
	private ICitaMedicaService citaMedicaService;
	
	private static final Logger logger = Logger.getLogger(PruebaUnidad2CaApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(PruebaUnidad2CaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		//Paciente
//		Paciente pac1 = new Paciente();
//		pac1.setNombre("Ana");
//		pac1.setApellido("Casas");
//		pac1.setCedula("1231322");
//		pac1.setCodigoSeguro("123456");
//		pac1.setEstatura(1.72);
//		pac1.setPeso(69d);
//		pac1.setFechaNacimiento(LocalDateTime.of(2000, 4,2,0,0));
//		pac1.setGenero("F");
//		
//		logger.debug("Insertar paciente 1"+pac1);
//		this.pacienteService.insertar(pac1);
//		
//		//Paciente2
//		Paciente pac2 = new Paciente();
//		pac2.setNombre("Jorge");
//		pac2.setApellido("Enriquez");
//		pac2.setCedula("1544352");
//		pac2.setCodigoSeguro("654321");
//		pac2.setEstatura(1.8);
//		pac2.setPeso(74d);
//		pac2.setFechaNacimiento(LocalDateTime.of(1972, 4,2,0,0));
//		pac2.setGenero("M");
//		
//		logger.debug("Insertar paciente 2"+pac2);
//		this.pacienteService.insertar(pac2);
//		
//		//Doctor
//		Doctor doc1 = new Doctor();
//		doc1.setNombre("Manuel");
//		doc1.setApellido("Villacis");
//		doc1.setCedula("122132312");
//		doc1.setCodigoSenescyt("1235345");
//		doc1.setFechaNacimiento(LocalDateTime.of(1969, 5,4,0,0));
//		doc1.setNumeroConsultorio("3");
//		doc1.setGenero("M");
//		
//		logger.debug("Insertar doctor 1"+ doc1);
//		this.doctorService.insertar(doc1);
//		
//		//Doctor2
//		Doctor doc2 = new Doctor();
//		doc2.setNombre("Ulises");
//		doc2.setApellido("Vaca");
//		doc2.setCedula("174532312");
//		doc2.setCodigoSenescyt("112335");
//		doc2.setFechaNacimiento(LocalDateTime.of(1995, 2,1,0,0));
//		doc2.setNumeroConsultorio("1");
//		doc2.setGenero("M");
//		
//		logger.debug("Insertar doctor 2"+doc2);
//		this.doctorService.insertar(doc2);
//		
//		logger.debug("Agendar una cita");
//		this.gestorCitaService.agendar("6",LocalDateTime.now(), new BigDecimal(25), "Quitumbe", "174532312", "1231322");
//		
//		logger.debug("Actualizar una cita");
//		this.citaMedicaService.actualizar("6", "ESTE ESEL DIAGNOSTICO", "paracetamol",LocalDateTime.of(2022, 8,1,0,0));
	
		//REPORTE EFICIENTE
		logger.debug("Reporte eficiente");
		List<PacienteSencillo> lista = this.pacienteService.reporteEficiente(LocalDateTime.of(1905, 1,1,0,0), "M");
		for(PacienteSencillo p:lista) {
			logger.debug(p);
		}
	}

}
