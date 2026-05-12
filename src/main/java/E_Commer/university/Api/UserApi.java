package E_Commer.university.Api;

import E_Commer.university.Entity.User;
import E_Commer.university.Service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserApi {

    private final UserService service;

    public UserApi(UserService service) {
        this.service = service;
    }

    @GetMapping
    public List<User> getUsers() {
        return service.getAllUsers();
    }
}