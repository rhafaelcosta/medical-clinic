package com.github.rhafaelcosta.medicalclinic.records;

import com.github.rhafaelcosta.medicalclinic.enums.Specialty;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record RecordDoctor(

		@NotBlank String name,

		@Email
		@NotBlank String email,

		@NotBlank
        String phone,

		@NotBlank
		@Pattern(regexp = "\\d{4,6}")
		String crm,

		@NotNull
		Specialty specialty,

		@Valid
		@NotNull
		RecordAddress address) {

}
