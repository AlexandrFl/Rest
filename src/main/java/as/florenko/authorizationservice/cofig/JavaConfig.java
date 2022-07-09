package as.florenko.authorizationservice.cofig;

import as.florenko.authorizationservice.controller.AuthorizationController;
import as.florenko.authorizationservice.repository.UserRepositoryImpl;
import as.florenko.authorizationservice.service.AuthorizationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean
    public AuthorizationService authorizationService() {
        return new AuthorizationService();
    }

    @Bean
    public UserRepositoryImpl userRepository() {
        return new UserRepositoryImpl();
    }
}
