package com.cgi.dentistapp.repositories;

import com.cgi.dentistapp.entity.DentistEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DentistRepo extends JpaRepository<DentistEntity, Long> {
    DentistEntity findByName(String name);
}
