package com.cgi.dentistapp.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Set;

@Entity
@Table(name = "dentist")
public class DentistEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long dentist_id;

    @Size(min = 1, max = 50)
    @NotNull
    private String name;

    @NotNull
    @OneToMany(mappedBy = "dentistEntity")
    private Set<DentistVisitEntity> dentistVisitEntities;

    public String getName() {
        return name;
    }

    public void setDentistName(String name) {
        this.name = name;
    }

}
