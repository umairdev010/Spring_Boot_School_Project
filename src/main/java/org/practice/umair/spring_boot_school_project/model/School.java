package org.practice.umair.spring_boot_school_project.model;

public class School {

    private Integer id;
    private String name;
    private String city;
    private Integer estbYear;

    public School() {
    }

    public School(String name, Integer id, String city, Integer estbYear) {
        this.name = name;
        this.id = id;
        this.city = city;
        this.estbYear = estbYear;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getEstbYear() {
        return estbYear;
    }

    public void setEstbYear(Integer estbYear) {
        this.estbYear = estbYear;
    }
}
