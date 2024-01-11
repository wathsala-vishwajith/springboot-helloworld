package org.example;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@org.springframework.stereotype.Controller
public class Controller {



    @GetMapping("/greeting")
    public String greetingUser(@RequestParam(name="name",required = false,defaultValue = "Andrew")String name, Model model){
        model.addAttribute("name",name);
        return "greeting";
    }

    @GetMapping("/login")
    public String loginUser(@RequestParam(name="name",required = false,defaultValue = "Andrew")String name, Model model){
        model.addAttribute("name",name);
        return "greeting";
    }


}
