package com.cgi.dentistapp.dto;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.time.LocalTime;

public class DentistVisitDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long dentistVisit_id;

    @NotNull
    @Size(min = 1, max = 50)
    private String dentistName;

    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate visitDate;

    @NotNull
    @DateTimeFormat(pattern = "HH:mm")
    private LocalTime visitTime;

    public DentistVisitDTO() {
    }

    public DentistVisitDTO(String dentistName, LocalDate visitDate, LocalTime visitTime) {
        this.dentistName = dentistName;
        this.visitDate = visitDate;
        this.visitTime = visitTime;
    }

    public String getDentistName() {
        return dentistName;
    }

    public void setDentistName(String dentistName) {
        this.dentistName = dentistName;
    }

    public LocalDate getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(LocalDate visitDate) {
        this.visitDate = visitDate;
    }

    public LocalTime getVisitTime() {
        return visitTime;
    }

    public void setVisitTime(LocalTime visitTime) {
        this.visitTime = visitTime;
    }

    public Long getDentistVisit_id() {
        return dentistVisit_id;
    }

    public void setDentistVisit_id(Long dentistVisit_id) {
        this.dentistVisit_id = dentistVisit_id;
    }
}
