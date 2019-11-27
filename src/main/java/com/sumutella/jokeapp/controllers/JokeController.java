package com.sumutella.jokeapp.controllers;

import com.sumutella.jokeapp.services.JokerService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author sumutella
 * @time 12:13 PM
 * @since 11/27/2019, Wed
 */
@Controller
public class JokeController {
    private JokerService jokerService;

    public JokeController(JokerService jokerService){
        this.jokerService = jokerService;
    }

    @RequestMapping({"/", ""})
    public String showJoke(Model model){
        model.addAttribute("joke", jokerService.getJoke());
        return "chucknorris";
    }



}
