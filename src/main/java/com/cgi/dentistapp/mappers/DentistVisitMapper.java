package com.cgi.dentistapp.mappers;

import com.cgi.dentistapp.dto.DentistVisitDTO;
import com.cgi.dentistapp.entity.DentistEntity;
import com.cgi.dentistapp.entity.DentistVisitEntity;

public class DentistVisitMapper {

    public DentistVisitDTO toDto(DentistVisitEntity entity) {

        DentistVisitDTO dto = new DentistVisitDTO();

        dto.setDentistVisit_id(entity.getDentistVisit_id());
        dto.setVisitTime(entity.getVisitTime());
        dto.setVisitDate(entity.getVisitDate());
        dto.setDentistName(entity.getDentistEntity().getName());

        return dto;
    }

    public DentistVisitEntity toEntity(DentistVisitDTO dto, DentistEntity dentistEntity) {

        DentistVisitEntity entity = new DentistVisitEntity();

        entity.setDentistVisit_id(dto.getDentistVisit_id());
        entity.setVisitTime(dto.getVisitTime());
        entity.setVisitDate(dto.getVisitDate());
        entity.setDentistEntity(dentistEntity);

        return entity;
    }
}
