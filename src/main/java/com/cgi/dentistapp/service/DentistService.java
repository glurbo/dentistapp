package com.cgi.dentistapp.service;

import com.cgi.dentistapp.repositories.DentistRepo;
import com.cgi.dentistapp.entity.DentistEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class DentistService {

    DentistRepo repo;

    public Iterable<DentistEntity> getAllDentists() {
        return repo.findAll();
    }
}
