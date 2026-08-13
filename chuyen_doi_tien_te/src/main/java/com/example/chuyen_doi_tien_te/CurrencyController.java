package com.example.chuyen_doi_tien_te;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CurrencyController {

    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("exchangeRate", 23500.0);
        model.addAttribute("usdAmount", 0.0);
        return "index";
    }

    @PostMapping("/convert")
    public String convert(@RequestParam("rate") double rate,
                          @RequestParam("usd") double usd,
                          Model model) {
        double result = rate * usd;

        model.addAttribute("exchangeRate", rate);
        model.addAttribute("usdAmount", usd);
        model.addAttribute("result", result);
        return "index";
    }
}
