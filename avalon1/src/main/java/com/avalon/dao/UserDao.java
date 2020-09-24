package com.avalon.dao;


import com.avalon.Entity.Apply;
import com.avalon.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void save(Apply use) {
        // TODO Auto-generated method stub
        //jdbcTemplate.update("insert into user (name,password) values(?,?)", use.getUsername());
      //  jdbcTemplate.update("insert into user (name,age) "+"values (' " + username + " ',  " +age +")");

    }
}
