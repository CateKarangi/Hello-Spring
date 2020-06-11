package org.launchcode.HelloSpring.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller

public class HelloSpringController {


    //Responds to /hello?name=LaunchCode
    @RequestMapping(method={RequestMethod.GET, RequestMethod.POST}, value="hello")
    public String hello(@RequestParam String name, Model model){
        String greeting= "Hello, " +name+ "!";
        model.addAttribute("greeting", greeting);
        return "hello";
    }

    //Handles request of the form /hello/LaunchCode
    @GetMapping("hello/{name}")
    public String helloTwice(@PathVariable String name, Model model){
        String greeting  = "Hello" +name+ "!";
        model.addAttribute("greeting", greeting);
        return "Hello, " + name +"!";
    }

    @GetMapping("form")
    public String helloForm1(){
return "form";

    }
@GetMapping("hello-names")
public String helloNames(Model model){
    List<String> names =new ArrayList<>();
    names.add("LaunchCode");
    names.add("Python");
    names.add("C++");
    names.add("JavaScript");
    names.add("Java");
    model.addAttribute("names", names);
    return "hello-list";
}

}
