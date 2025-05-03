package com.gomad.jpa_and_hibernate.CourseJDBC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJDBCRepo {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    private static String INSERT_QUERY = """
            insert into course(id, name, author)
            values(1, 'Learn AWS', 'Gomad')
            """;

    private static String INSERT_QUERY_CLASS = """
            insert into course(id, name, author)
            values(?, ? , ?)
            """;

    private static String DELETE_QUERY = """
            delete from course where id = ?
            """;
    
    private static String SELECT_QUERY = """
            select * from course where id = ?
            """;

    public void insert(){
        jdbcTemplate.update(INSERT_QUERY);
    }

    public void insertWithClass(Course course){
        jdbcTemplate.update(INSERT_QUERY_CLASS, course.getId(), course.getName(), course.getAuthor());
    }

    public void deleteWithID(long id){
        jdbcTemplate.update(DELETE_QUERY, id);
    }

    public Course getCourseById(long id){
        return jdbcTemplate.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Course.class), id);
    }

}
