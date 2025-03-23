package hery.itu.Daybyday.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class LaravelAuthService {

    private final WebClient webClient;

    private String url = "http://localhost:8000/api";

    public LaravelAuthService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder
                .baseUrl(url)
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .build();
    }

    public String authenticate(String email, String password) {
        return webClient.post()
                .uri("/login")
                .bodyValue(new LoginRequest(email, password))
                .retrieve()
                .bodyToMono(AuthResponse.class)
                .block()
                .getToken();
    }

    private static class LoginRequest {
        private String email;
        private String password;

        public LoginRequest(String email, String password) {
            this.email = email;
            this.password = password;
        }

        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        public String getPassword() {
            return password;
        }
        public void setPassword(String password) {
            this.password = password;
        }

        // Constructeurs, getters et setters
    }

    private static class AuthResponse {
        private String token;

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        // Constructeurs, getters et setters
    }
}