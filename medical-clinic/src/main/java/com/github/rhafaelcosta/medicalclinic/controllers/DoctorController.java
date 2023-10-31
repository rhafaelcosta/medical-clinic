package com.github.rhafaelcosta.medicalclinic.controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.rhafaelcosta.medicalclinic.model.Address;
import com.github.rhafaelcosta.medicalclinic.model.Doctor;
import com.github.rhafaelcosta.medicalclinic.records.RecordDoctor;
import com.github.rhafaelcosta.medicalclinic.repositories.DoctorRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("doctors")
public class DoctorController {

	@Autowired
	private DoctorRepository doctorRepository;

	@PostMapping
	public void create(@RequestBody @Valid RecordDoctor doctorRecord) {

		Doctor doctor = new Doctor();
		doctor.setAddress(new Address());

		BeanUtils.copyProperties(doctorRecord, doctor);
		BeanUtils.copyProperties(doctorRecord.address(), doctor.getAddress());

		doctorRepository.save(doctor);
	}
}
