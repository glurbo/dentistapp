package com.cgi.dentistapp.service;

import com.cgi.dentistapp.repositories.DentistRepo;
import com.cgi.dentistapp.entity.DentistEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class DentistService {

    @Autowired
    DentistRepo repo;

    public Iterable<DentistEntity> findAllDentists() {
        return repo.findAll();
    }
}
