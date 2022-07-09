package as.florenko.authorizationservice.service;

import as.florenko.authorizationservice.authorities.Authorities;
import as.florenko.authorizationservice.exeption.InvalidCredentials;
import as.florenko.authorizationservice.exeption.UnauthorizedUser;
import as.florenko.authorizationservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
public class AuthorizationService {
    @Autowired
    UserRepository userRepository;
    public List<Authorities> getAuthorities(String user, String password) {
        if (isEmpty(user) || isEmpty(password)) {
            throw new InvalidCredentials("User name or password is empty");
        }
        List<Authorities> userAuthorities = userRepository.getUserAuthorities(user, password);
        if (isEmpty(userAuthorities)) {
            throw new UnauthorizedUser("Unknown user " + user);
        }
        return userAuthorities;
    }
    private boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }
    private boolean isEmpty(List<?> str) {
        return str == null || str.isEmpty();
    }
}