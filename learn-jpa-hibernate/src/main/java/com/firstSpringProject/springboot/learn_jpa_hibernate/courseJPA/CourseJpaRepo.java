package com.firstSpringProject.springboot.learn_jpa_hibernate.courseJPA;

import com.firstSpringProject.springboot.learn_jpa_hibernate.course.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseJpaRepo {

    @PersistenceContext
    private EntityManager entityManager;

    public void insert(Course course){
        entityManager.merge(course);
    }
    public Course selectById(long id){
        return entityManager.find(Course.class, id);
    }
    public void delete(long id){
        Course course = entityManager.find(Course.class, id);
        entityManager.remove(course);
    }
}
