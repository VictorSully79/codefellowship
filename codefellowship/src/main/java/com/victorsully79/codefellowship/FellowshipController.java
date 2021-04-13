package com.victorsully79.codefellowship;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

public class FellowshipController {
    @GetMapping("/")
    public String showFellowshipHome(Principal p) {
        if (p != null) {

        }
        return "index";
    }
}