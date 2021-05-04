package com.cgi.dentistapp.service;

import com.cgi.dentistapp.dto.DentistVisitDTO;
import com.cgi.dentistapp.mappers.DentistVisitMapper;
import com.cgi.dentistapp.repositories.DentistRepo;
import com.cgi.dentistapp.repositories.DentistVisitRepo;
import com.cgi.dentistapp.entity.DentistEntity;
import com.cgi.dentistapp.entity.DentistVisitEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class DentistVisitService {

    @Autowired
    DentistVisitRepo dentistVisitRepo;
    @Autowired
    DentistRepo dentistRepo;
    DentistVisitMapper mapper = new DentistVisitMapper();

    public void addVisit(DentistVisitDTO dentistVisitDTO) {
        DentistEntity dentistEntity = dentistRepo.findByName(dentistVisitDTO.getDentistName());
        DentistVisitEntity visitEntity = mapper.toEntity(dentistVisitDTO, dentistEntity);
        dentistVisitRepo.save(visitEntity);
    }

    public void deleteVisit(Long id) {
        dentistVisitRepo.delete(id);
    }

    public List<DentistVisitDTO> findAllVisits() {
        List<DentistVisitDTO> result = new ArrayList<>();
        Iterable<DentistVisitEntity> entities = dentistVisitRepo.findAll();
        for (DentistVisitEntity entity : entities) {
            result.add(mapper.toDto(entity));
        }
        return result;
    }

    public DentistVisitDTO findOneVisit(Long id) {
        DentistVisitEntity entity = dentistVisitRepo.findOne(id);
        return mapper.toDto(entity);
    }

}
