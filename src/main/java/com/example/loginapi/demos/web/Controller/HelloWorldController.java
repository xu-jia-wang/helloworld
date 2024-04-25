package com.example.loginapi.demos.web.Controller;



import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello/{username}/{password}")
public class HelloWorldController {
    @GetMapping()
    public String helloworld(@PathVariable("username") String username, @PathVariable("password")  String password) {

        if (username.equals("test") && password.equals("123456")) {
            return "登录成功";
        } else {
            return "登录失败";
        }
    }
}
