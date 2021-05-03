package com.cgi.dentistapp.repositories;

import com.cgi.dentistapp.entity.DentistVisitEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DentistVisitRepo extends JpaRepository<DentistVisitEntity, Long> {

}
