package me.snajdovski.crossfit.controller;


import me.snajdovski.crossfit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/user")
public class UserController {


    private final UserService userService;

    //dependency injection e potreben (autowired), instaciranje na userService (klasa koja treba da bide springbean)
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/subscribers")
    public List<User> getListOfSubscribers(){
        return userService.getSubscribers();
    }

    @PostMapping
    public void RegisterNewUserEntry(@RequestBody User user){
        userService.addNewSubscriber(user);
    }
}
