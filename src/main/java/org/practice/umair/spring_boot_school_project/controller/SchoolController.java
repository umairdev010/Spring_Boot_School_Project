package org.practice.umair.spring_boot_school_project.controller;

import org.practice.umair.spring_boot_school_project.model.School;
import org.practice.umair.spring_boot_school_project.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/")
public class SchoolController {

    @Autowired
    private SchoolRepository schoolRepository;

    // Add this test endpoint FIRST
    @GetMapping("/test")
    @ResponseBody
    public String test() {
        return "✅ Controller is WORKING! Time: " + new java.util.Date();
    }

    @GetMapping("/")
    public String home(Model model) {
        System.out.println("✓ Home method called!");
        try {
            List<School> schools = schoolRepository.findAll();
            System.out.println("Found " + schools.size() + " schools");
            model.addAttribute("school", new School()); // Always use new for form
            model.addAttribute("allSchools", schools);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            model.addAttribute("school", new School());
            model.addAttribute("allSchools", List.of());
        }
        return "home";
    }

    @PostMapping("/save")
    public String saveSchool(@ModelAttribute School school) {
        System.out.println("✓ Saving school: " + school.getName());
        schoolRepository.save(school);
        return "redirect:/school/";  // FIXED: Added trailing slash
    }

    @GetMapping("/edit/{id}")
    public String editSchool(@PathVariable Integer id, Model model) {
        System.out.println("✓ Editing school ID: " + id);
        // For now, get all and find the one with matching ID
        List<School> schools = schoolRepository.findAll();
        School school = schools.stream()
                .filter(s -> s.getId() != null && s.getId().equals(id))
                .findFirst()
                .orElse(new School());
        model.addAttribute("school", school);
        model.addAttribute("allSchools", schools);
        return "home";
    }

    @GetMapping("/delete/{id}")
    public String deleteSchool(@PathVariable Integer id) {
        System.out.println("✓ Deleting school ID: " + id);
        schoolRepository.deleteById(id);
        return "redirect:/school/";
    }
}