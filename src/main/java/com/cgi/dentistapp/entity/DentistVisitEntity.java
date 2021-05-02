package com.cgi.dentistapp.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Table(name = "dentist_visit")
public class DentistVisitEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long dentistVisit_id;

    @NotNull
    @DateTimeFormat(pattern="dd.MM.yyyy")
    private LocalDateTime visitDate;

    @ManyToOne
    @JoinColumn(name="dentist_id", nullable = false)
    private DentistEntity dentistEntity;

    public void setVisitDate(LocalDateTime visitDate) {
        this.visitDate = visitDate;
    }

    public LocalDateTime getVisitDate() {
        return visitDate;
    }

    public void setDentistEntity(DentistEntity dentistEntity) {
        this.dentistEntity = dentistEntity;
    }

    public DentistEntity getDentistEntity() {
        return dentistEntity;
    }
}
