package as.florenko.authorizationservice.repository;

import as.florenko.authorizationservice.authorities.Authorities;

import java.util.List;

public interface UserRepository {
    List<Authorities> getUserAuthorities(String user, String password);
}