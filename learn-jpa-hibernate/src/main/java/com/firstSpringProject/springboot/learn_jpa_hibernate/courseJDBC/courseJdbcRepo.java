package com.firstSpringProject.springboot.learn_jpa_hibernate.courseJDBC;

import com.firstSpringProject.springboot.learn_jpa_hibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class courseJdbcRepo {

    @Autowired
    private JdbcTemplate springJbdcTemplate;

    private static String insert_sql =
            """
                    insert into courses (id, name, author) values (?, ?, ?);
               
                    """;
    private static String delete_sql =
            """
                    delete from courses where id = ?;
                    """;
    private static String select_sql =
            """
                    select * from courses where id = ?;
                    """;
    public void insert(Course course){
        springJbdcTemplate.update(insert_sql,
                course.getId(), course.getName(), course.getAuthor());
    }
    public void delete(long id){
        springJbdcTemplate.update(delete_sql,id);
    }

    public Course selectById(long id){
        return springJbdcTemplate.queryForObject(select_sql,
                new BeanPropertyRowMapper<>(Course.class), id);
    }
}
