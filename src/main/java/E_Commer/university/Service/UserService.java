package E_Commer.university.Service;

import E_Commer.university.Entity.User;
import E_Commer.university.Repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class UserService {


        private final UserRepository repo;

        public UserService(UserRepository repo) {
            this.repo = repo;
        }

        public List<User> getAllUsers() {
            return repo.findAll();
        }

}
