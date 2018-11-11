package com.healthcare.f22b_9healthcare.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthcare.f22b_9healthcare.Dao.PatientDao;
import com.healthcare.f22b_9healthcare.entity.Patient;

@Service
public class PatientService {

	@Autowired
	private PatientDao patientDao;

//============================================
	//Post Details
	
	public void patientInfo(Patient patient) { 
		patientDao.save(patient);
	}
	
	public void allPatientInfo(List<Patient> patients) {
		patientDao.saveAll(patients);
	}
	
	
	public List<Patient> getAll() {
		return patientDao.findAll();
	}
	
	public Patient getById(Long id) {
		return patientDao.findById(id).get();
	}
	
	public void delete(Long id) {
		patientDao.deleteById(id);
	}
	
	
//==============================================	
	//Get Details
	
	
	public List<Object[]> getPatientByMedicineName(String medicineName) {
		return patientDao.getPatientByMedicineName(medicineName);
	}
	
	
	
	
	
}
