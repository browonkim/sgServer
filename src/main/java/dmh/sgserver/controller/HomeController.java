package dmh.sgserver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @GetMapping("/")
    public String homepage(){
        return "home";
    }

    @GetMapping("/login")
    public String login(){
        return "login_resist_form";
    }

}
