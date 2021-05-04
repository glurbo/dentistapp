package com.cgi.dentistapp.entity;

import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "dentist_visit")
public class DentistVisitEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long dentistVisit_id;

    @NotNull
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private LocalDate visitDate;

    @NotNull
    @DateTimeFormat(pattern = "HH:mm")
    private LocalTime visitTime;

    @ManyToOne
    @JoinColumn(name="dentist_id", nullable = false)
    private DentistEntity dentistEntity;

    public void setVisitDate(LocalDate visitDate) {
        this.visitDate = visitDate;
    }

    public LocalDate getVisitDate() {
        return visitDate;
    }

    public void setVisitTime(LocalTime visitTime) {
        this.visitTime = visitTime;
    }

    public LocalTime getVisitTime() {
        return visitTime;
    }

    public void setDentistEntity(DentistEntity dentistEntity) {
        this.dentistEntity = dentistEntity;
    }

    public DentistEntity getDentistEntity() {
        return dentistEntity;
    }

    public Long getDentistVisit_id() {
        return dentistVisit_id;
    }

    public void setDentistVisit_id(Long dentistVisit_id) {
        this.dentistVisit_id = dentistVisit_id;
    }
}
