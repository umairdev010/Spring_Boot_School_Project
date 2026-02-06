package org.practice.umair.spring_boot_school_project.repository;

import org.practice.umair.spring_boot_school_project.model.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SchoolRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<School> findAll() {
        return jdbcTemplate.query("SELECT * FROM school", (rs, row) -> {
            School school = new School();
            school.setId(rs.getInt("id"));
            school.setName(rs.getString("name"));
            school.setCity(rs.getString("city"));
            school.setEstbYear(rs.getInt("estb_year"));
            return school;
        });
    }

    public School findById(Integer id) {
        String sql = "SELECT * FROM school WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, (rs, rowNum) -> {
            School school = new School();
            school.setId(rs.getInt("id"));
            school.setName(rs.getString("name"));
            school.setCity(rs.getString("city"));
            school.setEstbYear(rs.getInt("estb_year"));
            return school;
        });
    }

    public School save(School school) {
        if (school.getId() == null) {
            String sql = "INSERT INTO school (name, city, estb_year) VALUES (?, ?, ?)";
            jdbcTemplate.update(sql, school.getName(), school.getCity(), school.getEstbYear());
        } else {
            String sql = "UPDATE school SET name = ?, city = ?, estb_year = ? WHERE id = ?";
            jdbcTemplate.update(sql, school.getName(), school.getCity(),
                    school.getEstbYear(), school.getId());
        }
        return school;
    }

    public void deleteById(Integer id) {
        jdbcTemplate.update("DELETE FROM school WHERE id = ?", id);
    }

}
