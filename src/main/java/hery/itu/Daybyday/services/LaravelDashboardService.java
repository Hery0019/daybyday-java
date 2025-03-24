package hery.itu.Daybyday.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import hery.itu.Daybyday.entity.DashboardData;

@Service
public class LaravelDashboardService {

    private final RestTemplate restTemplate;

    @Autowired
    public LaravelDashboardService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public DashboardData getDashboardData() {
        String url = "http://localhost:8000/api/dashboardjson"; // Remplacez par l'URL de votre API Laravel
        return restTemplate.getForObject(url, DashboardData.class);
    }
}