package com.example.springboot1._1_first_api;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class _0_First_API {
        @RequestMapping("/allCourses")
        public List<Course> retrieveAllCourses(){
            return Arrays.asList(
                new Course(1, "AWS", "gomad"),
                new Course(2, "Python", "gomad"),
                new Course(2, "JS", "gomad")
            );
        }
}
