package com.gomad.jpa_and_hibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.gomad.jpa_and_hibernate.CourseJDBC.Course;
import com.gomad.jpa_and_hibernate.CourseJDBC.CourseJDBCRepo;
import com.gomad.jpa_and_hibernate.CourseJPA.CourseJPA;
import com.gomad.jpa_and_hibernate.CourseJPA.CourseJPARepo;
import com.gomad.jpa_and_hibernate.CourseSpringDataJPA.CourseSpringDataJPA;
import com.gomad.jpa_and_hibernate.CourseSpringDataJPA.CourseSpringDataJPARepo;


@Component
public class CourseCommandLineInterface implements CommandLineRunner {
    
    @Autowired
    private CourseJDBCRepo courseJDBCRepo;

    @Autowired
    private CourseJPARepo courseJPARepo;

    @Autowired
    private CourseSpringDataJPARepo courseSpringDataJPARepo;

    @Override
    public void run(String... args) throws Exception {
        courseJDBCRepo.insert();
        courseJDBCRepo.insertWithClass(new Course(2, "Learn AZURE", "Gomad"));
        courseJDBCRepo.insertWithClass(new Course(3, "Learn GCP", "Gomad"));
        courseJDBCRepo.insertWithClass(new Course(4, "Learn React", "Gomad"));
        courseJDBCRepo.deleteWithID(3);
        System.out.println(courseJDBCRepo.getCourseById(1));
        System.out.println(courseJDBCRepo.getCourseById(4));

        courseJPARepo.insert(new CourseJPA(11, "Learn AWS JPA", "Gomad"));
        courseJPARepo.insert(new CourseJPA(12, "Learn AZURE JPA", "Gomad"));
        courseJPARepo.insert(new CourseJPA(13, "Learn GCP JPA", "Gomad"));
        courseJPARepo.insert(new CourseJPA(14, "Learn React JPA", "Gomad"));
        courseJPARepo.deleteById(13);
        System.out.println(courseJPARepo.getCourseById(11));
        System.out.println(courseJPARepo.getCourseById(14));


        courseSpringDataJPARepo.save(new CourseSpringDataJPA(21, "Learn AWS Spring Data JPA", "Gomad"));
        courseSpringDataJPARepo.save(new CourseSpringDataJPA(22, "Learn AZURE Spring Data JPA", "Gomad"));
        courseSpringDataJPARepo.save(new CourseSpringDataJPA(23, "Learn GCP Spring Data JPA", "Gomad"));
        courseSpringDataJPARepo.save(new CourseSpringDataJPA(24, "Learn React Spring Data JPA", "Govind"));
        courseSpringDataJPARepo.deleteById(23l);
        System.out.println(courseSpringDataJPARepo.findById(22l));
        System.out.println(courseSpringDataJPARepo.findById(24l));
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println(courseSpringDataJPARepo.findByName("Learn React Spring Data JPA"));
        System.out.println("==============================================");
        System.out.println(courseSpringDataJPARepo.findByAuthor("Govind"));
        System.out.println("==============================================");
        System.out.println("==============================================");
       
    }
    
}
