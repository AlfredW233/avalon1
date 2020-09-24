package com.avalon.Controller;


import com.avalon.Entity.Apply;
import com.sun.deploy.security.JarSignature;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.jdbc.core.JdbcTemplate;

@ResponseBody

public class ApplyController {

    /**
     * 新增数据
     * @param items
     * @return
     */
    @PostMapping("/add")
    public String  addItems(Apply items) {
        String sql = "insert into items (username,password) value (?,?)";
        Object args[] = {items.getUsername(),items.getPassword()};
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        int temp = jdbcTemplate.update(sql, args);
        if(temp > 0) {
            return "文章新增成功";
        }
        return "新增出现错误";
    }



}
