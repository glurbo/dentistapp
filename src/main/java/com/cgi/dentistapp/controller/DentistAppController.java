package com.cgi.dentistapp.controller;

import com.cgi.dentistapp.dto.DentistVisitDTO;
import com.cgi.dentistapp.entity.DentistEntity;
import com.cgi.dentistapp.entity.DentistVisitEntity;
import com.cgi.dentistapp.service.DentistService;
import com.cgi.dentistapp.service.DentistVisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;

@Controller
@EnableAutoConfiguration
public class DentistAppController extends WebMvcConfigurerAdapter {

    @Autowired
    private DentistVisitService dentistVisitService;

    @Autowired
    private DentistService dentistService;

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/results").setViewName("results");
    }

    @GetMapping("/")
    public String showRegisterForm(DentistVisitDTO dentistVisitDTO, Model model) {
        Iterable<DentistEntity> dentists = dentistService.findAllDentists();
        model.addAttribute("dentists", dentists);
        return "form";
    }

    @PostMapping("/")
    public String postRegisterForm(@Valid DentistVisitDTO dentistVisitDTO, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            Iterable<DentistEntity> dentists = dentistService.findAllDentists();
            model.addAttribute("dentists", dentists);
            return "form";
        }
        dentistVisitService.addVisit(dentistVisitDTO);
        return "redirect:/results";
    }

    @GetMapping("/registrations")
    public String showRegistrations(Model model) {
        List<DentistVisitDTO> dentistVisits = dentistVisitService.findAllVisits();
        model.addAttribute("dentistvisits", dentistVisits);
        return "registrations";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteRegistration(@PathVariable String id, Model model) {
        DentistVisitDTO visit = dentistVisitService.findOneVisit(Long.valueOf(id));
        model.addAttribute("visit", visit);
        return "delete";
    }

    @PostMapping("/delete/{id}")
    public String deleteConfirm(@Valid String id) {
        dentistVisitService.deleteVisit(Long.valueOf(id));
        return "redirect:/registrations";
    }

}
