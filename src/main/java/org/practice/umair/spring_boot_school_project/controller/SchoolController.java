package org.practice.umair.spring_boot_school_project.controller;

import org.practice.umair.spring_boot_school_project.model.School;
import org.practice.umair.spring_boot_school_project.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller

@RequestMapping("/school")
public class SchoolController {

    @Autowired
    private SchoolRepository schoolRepository;


    @GetMapping
    public String home(Model model) {
        List<School> schools = schoolRepository.findAll();

        model.addAttribute("school", schools.isEmpty() ? new School() : schools.get(0));
        model.addAttribute("allSchools", schools);

        return "home";
    }

    @PostMapping("/save")
    public String saveSchool(@ModelAttribute School school) {
        schoolRepository.save(school);
        return "redirect:/school";
    }

}
