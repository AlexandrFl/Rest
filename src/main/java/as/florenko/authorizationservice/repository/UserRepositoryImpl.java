package as.florenko.authorizationservice.repository;

import as.florenko.authorizationservice.authorities.Authorities;

import java.util.LinkedList;
import java.util.List;
public class UserRepositoryImpl implements UserRepository{
    @Override
    public List<Authorities> getUserAuthorities(String user, String password) {
        List<Authorities> list = new LinkedList<>();
         if (user.equalsIgnoreCase("Билл") && password.equals("000000")) {
            list.add(Authorities.WRITE);
        } else if (user.equalsIgnoreCase("Пол") && password.equals("000000")) {
             list.add(Authorities.DELETE);
         }
        return list;
    }
}
