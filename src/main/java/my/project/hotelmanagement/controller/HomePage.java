package my.project.hotelmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePage {
    @GetMapping("/")
    public String homepage(){
        return "HomePage";
    }
}
