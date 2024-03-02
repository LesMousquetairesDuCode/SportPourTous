package fr.sportpourtous.adapter.in;

import fr.sportpourtous.domain.IndividualUser;
import fr.sportpourtous.domain.User;
import org.springframework.web.bind.annotation.*;
import fr.sportpourtous.application.services.UserService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

@RestController
class UserController {
    // user id to be retrieved
    @GetMapping("/user/{userId}")
    public User getUser(@PathVariable String userId) {
        return new User("eduardo", "pina", 29, "jepr@mail.fr", "87654321", "2423435445624");
    }


    @GetMapping("/users/")
    public List<User> getUsers() {
        List<User> userList = new ArrayList<>();
        userList.add(new User("eduardo", "pina", 29, "jeseduardopi@gmail.com", "87654321", "2423435445624"));
        userList.add(new User("user2", "last2", 30, "user2@gmail.com", "87654321", "242343544562424"));
        userList.add(new User("user3", "last3", 31, "user3@gmail.com", "87654321", "242343544562424"));
        userList.add(new User("user4", "last4", 32, "user4@gmail.com", "87654321", "242343544562424"));
        return userList;
        //return userService.getAllUsers();
    }


}

//    @GetMapping( "/usersx")
//    public List<User> getUsers() {
//        User test = new User(1324343532423412341L, "eduardo", "jeseduardopi@gmail.com");
//        List<User> userList = new ArrayList<>();
//        userList.add(test);
//
//        return userList;
//return userService.getAllUsers();
//   }
//UserService userService;

//    private final userservice userservice; // assuming a userservice to handle business logic
//
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }
//
//    @postmapping("/individual")
//    public user createindividualuser(@requestbody individualuserdto individualuserdto) {
//        return userservice.createindividualuser(individualuserdto);
//    }
//
//    @postmapping("/enterprise")
//    public user createenterpriseuser(@requestbody enterpriseuserdto enterpriseuserdto) {
//        return userservice.createenterpriseuser(enterpriseuserdto);
//    }


