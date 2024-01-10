package com.rungroup.websiteexample;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonController {

    @GetMapping("/")
    public String showPersonDetails(Model model) {

        Person person = new Person("John doe", 23);

        // add the person object to the model
        model.addAttribute("person", person);

        return "personDetails";

    }

}
