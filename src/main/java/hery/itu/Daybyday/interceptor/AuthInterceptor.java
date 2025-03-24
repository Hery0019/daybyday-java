package hery.itu.Daybyday.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class AuthInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession(false);

        // Vérifier si la session existe et si le token est présent
        if (session == null || session.getAttribute("token") == null) {
            response.sendRedirect("/login");
            return false; // Bloquer l'accès à l'endpoint
        }

        return true; // Autoriser l'accès à l'endpoint
    }
}