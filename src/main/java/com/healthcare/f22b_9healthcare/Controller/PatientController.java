package com.healthcare.f22b_9healthcare.Controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.healthcare.f22b_9healthcare.Dao.PatientDao;
import com.healthcare.f22b_9healthcare.Service.PatientService;
import com.healthcare.f22b_9healthcare.entity.Patient;

@RestController
@RequestMapping("patientInfo")
@CrossOrigin
public class PatientController {

	@Autowired
	private PatientService patientService;

//============================================
	//Post Details
	
	@PostMapping
	public void patientInfo(@RequestBody Patient patient) {
	//	patient.setDate(new Date());
		patientService.patientInfo(patient);
	}
	
	@PostMapping("/all")
	public void allPatientInfo(@RequestBody List<Patient> patients) {
		patientService.allPatientInfo(patients);
	}
	@GetMapping("/getAll")
	public List<Patient> getAll() {
		return patientService.getAll();
	}
	
	@GetMapping("/getById/{id}")
	public Patient getById(@PathVariable("id") Long id) {
		return patientService.getById(id);
	}
	
	@DeleteMapping("delete/{id}")
	public void delete(@PathVariable("id") Long id) {
		patientService.delete(id);
	}
//=======================================================
	//Get Details
	
	@GetMapping("/byMeedicine/{name}")
	public List<Object[]> getPatientByMedicineName(@PathVariable("name") String medicineName) {
		return patientService.getPatientByMedicineName(medicineName);
		
	}
	
}
