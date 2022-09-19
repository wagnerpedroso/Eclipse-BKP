package dev.repository;

import dev.model.Course;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CourseRepository implements CrudRepository<Course>{

    private List<Course> courses;

    @Override
    public List<Course> findAll() {
        this.courses = new ArrayList<>();
        Course springBoot = new Course(0,"aaaa","aaaa","aaaa.com");
        this.courses.add(springBoot);
        return courses;
    }
}
