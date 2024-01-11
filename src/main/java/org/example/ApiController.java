package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ApiController {
    @GetMapping("/api/users")
    public String greeting(){
        return "Hello, World!";
    }

    @GetMapping("/api/user")
    public User getUserbyID(@RequestParam(name="id",required = false,defaultValue = "3") Long id){
        return new User(id,"something","someone@something.com");
    }

}
