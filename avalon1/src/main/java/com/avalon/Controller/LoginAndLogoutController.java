package com.avalon.Controller;


import com.avalon.Service.LoginAndLogoutService;
import com.avalon.VO.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class LoginAndLogoutController {

    @Autowired(required = false)
    private LoginAndLogoutService loginAndLogoutService;

    @PostMapping("/login")
    public ResultVO login(@RequestParam("username")String username, @RequestParam("password")String password){
        if(loginAndLogoutService.login(username, password)){
            return new ResultVO(0,"登陆成功");
        }
        return new ResultVO(1,"登录失败");
    }
}
