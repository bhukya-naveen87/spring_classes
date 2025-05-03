package com.gomad.jpa_and_hibernate.CourseJPA;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJPARepo {

    // @Autowired
    @PersistenceContext
    private EntityManager entityManager;

    public void insert(CourseJPA courseJpa){
        entityManager.merge(courseJpa);
    }

    public void deleteById(long id){
        CourseJPA course = entityManager.find(CourseJPA.class, id);
        entityManager.remove(course);
    }

    public CourseJPA getCourseById(long id){
        return entityManager.find(CourseJPA.class, id);
    }

}
