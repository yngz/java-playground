package com.yngz.stripepayments.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @Value("${stripe.public.key}")
    private String stripePublicKey;

    @GetMapping("")
    public String home(Model model) {
        model.addAttribute("stripePublicKey", stripePublicKey);
        return "index";
    }
}
