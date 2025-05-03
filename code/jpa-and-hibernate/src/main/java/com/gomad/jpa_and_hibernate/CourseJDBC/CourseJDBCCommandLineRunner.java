package com.gomad.jpa_and_hibernate.CourseJDBC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJDBCCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJDBCRepo courseJDBCRepo;

    @Override
    public void run(String... args) throws Exception {
        courseJDBCRepo.insert();
        courseJDBCRepo.insertWithClass(new Course(2, "Learn AZURE", "Gomad"));
        courseJDBCRepo.insertWithClass(new Course(3, "Learn GCP", "Gomad"));
        courseJDBCRepo.insertWithClass(new Course(4, "Learn React", "Gomad"));
        courseJDBCRepo.deleteWithID(3);
        System.out.println(courseJDBCRepo.getCourseById(1));
        System.out.println(courseJDBCRepo.getCourseById(4));
    }
}
