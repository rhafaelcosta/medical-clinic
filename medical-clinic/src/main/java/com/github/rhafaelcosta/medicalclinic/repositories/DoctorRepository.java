package com.github.rhafaelcosta.medicalclinic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.rhafaelcosta.medicalclinic.model.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {

}
