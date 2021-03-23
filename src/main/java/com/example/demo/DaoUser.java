package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class DaoUser {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<User> getUserById(Long id){
        String getSql = "select * from users where id = " + id;

        return jdbcTemplate.query(getSql, new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                User user = new User();
                user.setName(resultSet.getString("NAME"));
                user.setId(resultSet.getLong("ID"));
                return user;
            }
        });
    }
}
