package com.example.stackoverflow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}

class Greeting {

    private String content;
    
    public Greeting(String content){
        this.content = content;
    }
    
    public String getContent() {
        return content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }
    
}

@Controller
class IndexController {
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model){
        Greeting greeting = new Greeting("Thymeleaf Test Message");
        model.addAttribute("greeting", greeting);
        return "index";
    }
}