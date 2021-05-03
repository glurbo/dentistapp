package com.cgi.dentistapp.repositories;

import com.cgi.dentistapp.entity.DentistVisitEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface DentistVisitRepo extends JpaRepository<DentistVisitEntity, Long> {

}
