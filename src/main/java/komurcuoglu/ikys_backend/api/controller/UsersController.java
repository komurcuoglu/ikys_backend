package komurcuoglu.ikys_backend.api.controller;


import komurcuoglu.ikys_backend.business.abstracts.UserService;
import komurcuoglu.ikys_backend.core.entities.User;
import komurcuoglu.ikys_backend.core.utilities.results.DataResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@CrossOrigin
public class UsersController {

    private UserService userService;

    @Autowired
    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/getAll")
    public DataResult<List<User>> getAll(){
        return userService.getAll();
    }

    @GetMapping("/getById")
    public DataResult<User> getById(@RequestParam int id){
        return userService.getById(id);
    }

    /*
    @GetMapping("/getByEmail")
    public DataResult<User> getByEmail(@RequestParam String email){
        return userService.getByEmail(email);
    }
    */
}
