package com.example.tinh_luong_nhan_vien_theo_ca;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SalaryController {

    @GetMapping("/")
    public String showForm() {
        return "index";
    }

    @PostMapping("/calculate")
    public String calculate(
            @RequestParam("shiftHours") double[] shiftHours,
            @RequestParam("hourlyRate") double hourlyRate,
            Model model) {

        double totalHours = 0;

        for (double hours : shiftHours) {
            totalHours += hours;
        }

        double totalSalary = totalHours * hourlyRate;

        model.addAttribute("shiftHours", shiftHours);
        model.addAttribute("hourlyRate", hourlyRate);
        model.addAttribute("totalHours", totalHours);
        model.addAttribute("totalSalary", totalSalary);

        return "result";
    }
}