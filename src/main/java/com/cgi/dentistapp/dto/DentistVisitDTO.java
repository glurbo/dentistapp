package com.cgi.dentistapp.dto;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class DentistVisitDTO {

    @Size(min = 1, max = 50)
    String dentistName;

    @NotNull
    @DateTimeFormat(pattern = "dd.MM.yyyy")
    LocalDateTime visitDate;
//    String visitTime;

    public DentistVisitDTO() {
    }

    public DentistVisitDTO(String dentistName, String visitDate) {
        this.dentistName = dentistName;
        this.visitDate = LocalDateTime.parse(visitDate, DateTimeFormatter.ISO_DATE_TIME);
    }

    public String getDentistName() {
        return dentistName;
    }

    public void setDentistName(String dentistName) {
        this.dentistName = dentistName;
    }

    public LocalDateTime getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(String visitDate) {
        this.visitDate = LocalDateTime.parse(visitDate, DateTimeFormatter.ISO_DATE_TIME);
    }
}
