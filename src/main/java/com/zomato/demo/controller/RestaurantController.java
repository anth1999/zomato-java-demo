
package com.zomato.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class RestaurantController {

    @GetMapping("/")
    public String home(Model model) {

        List<String> restaurants = List.of(
                "Biryani House",
                "Pizza Palace",
                "Burger Hub",
                "South Indian Tiffins",
                "Chinese Express"
        );

        model.addAttribute("restaurants", restaurants);
        return "index";
    }
}
