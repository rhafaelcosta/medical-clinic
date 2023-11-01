package com.github.rhafaelcosta.medicalclinic.records;

import com.github.rhafaelcosta.medicalclinic.enums.Specialty;
import com.github.rhafaelcosta.medicalclinic.model.Doctor;

public record DoctorDto(String name, String email, String crm, Specialty specialty) {

	public DoctorDto(Doctor doctor) {
		this(doctor.getName(), doctor.getEmail(), doctor.getCrm(), doctor.getSpecialty());
	}

}
