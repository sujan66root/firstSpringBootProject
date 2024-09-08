package com.firstSpringProject.springboot.learn_jpa_hibernate.course;

import com.firstSpringProject.springboot.learn_jpa_hibernate.courseJDBC.courseJdbcRepo;
import com.firstSpringProject.springboot.learn_jpa_hibernate.courseJPA.CourseJpaRepo;
import com.firstSpringProject.springboot.learn_jpa_hibernate.courseSpringDataJPA.CourseSpringJpaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class courseCommandLineRunner implements CommandLineRunner {
//    @Autowired
//    private courseJdbcRepo repository;
//    @Autowired
//    private CourseJpaRepo repository;
    @Autowired
    private CourseSpringJpaRepo repository;

    @Override
    public void run(String... args) throws Exception {
//        for jpa
//        repository.insert(new Course(1, "DSA", "Udemy"));
//        repository.insert(new Course(2, "Java", "Udemy"));
//        repository.delete(1);
//        System.out.println(repository.selectById(2));

//        for spring data jpa
        repository.save(new Course(1, "DSA", "Udemy"));
        repository.save(new Course(2, "Java", "Udemy"));
        repository.deleteById(1l);
        System.out.println(repository.findById(2l));
    }
}
