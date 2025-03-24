package hery.itu.Daybyday.controller;


import hery.itu.Daybyday.entity.DashboardData;
import hery.itu.Daybyday.services.LaravelDashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class DashboardController {

    @Autowired
    private LaravelDashboardService laravelDashboardService;

    @GetMapping("/dashboard")
    public String getDashboard(Model model) {
        DashboardData dashboardData = laravelDashboardService.getDashboardData();
        model.addAttribute("dashboardData", dashboardData);
        return "dashboard"; // Retourne le nom de la vue Thymeleaf (dashboard.html)
    }
}