package com.cgi.dentistapp.service;

import com.cgi.dentistapp.repositories.DentistVisitRepo;
import com.cgi.dentistapp.entity.DentistEntity;
import com.cgi.dentistapp.entity.DentistVisitEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDateTime;

@Service
@Transactional
public class DentistVisitService {

    DentistVisitRepo repo;

    public void addVisit(String dentistName, LocalDateTime visitDate) {

        DentistEntity dentistEntity = new DentistEntity();
        dentistEntity.setDentistName(dentistName);

        DentistVisitEntity visitEntity = new DentistVisitEntity();
        visitEntity.setVisitDate(visitDate);
        visitEntity.setDentistEntity(dentistEntity);

        repo.save(visitEntity);


        //TODO implementation
    }
}
