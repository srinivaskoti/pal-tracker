package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WelcomeController {


    private String message;


    public WelcomeController( @Value("${welcome.message}") String message)
    {
        System.out.println("The Env msgs  is : "+message);
        this.message=message;
    }

    @GetMapping("/")
    public String sayHello(){
        return message;
    }
}
