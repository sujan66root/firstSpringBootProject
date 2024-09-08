package com.firstSpringProject.springboot.learn_jpa_hibernate.courseSpringDataJPA;

import com.firstSpringProject.springboot.learn_jpa_hibernate.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringJpaRepo extends JpaRepository<Course, Long>{

}