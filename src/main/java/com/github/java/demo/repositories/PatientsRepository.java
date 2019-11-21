package com.github.java.demo.repositories;

import com.github.java.demo.domain.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientsRepository extends JpaRepository<Patient, Long> {


}
