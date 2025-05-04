package com.gomad.jpa_and_hibernate.CourseSpringDataJPA;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringDataJPARepo extends JpaRepository<CourseSpringDataJPA, Long> {

    List<CourseSpringDataJPA> findByName(String name);
    List<CourseSpringDataJPA> findByAuthor(String author);
}
