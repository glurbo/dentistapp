package com.cgi.dentistapp.repositories;

import com.cgi.dentistapp.entity.DentistVisitEntity;
import org.springframework.data.jpa.repository.JpaRepository;

// gets API for CRUD operations
public interface DentistVisitRepo extends JpaRepository<DentistVisitEntity, Long> {

}
