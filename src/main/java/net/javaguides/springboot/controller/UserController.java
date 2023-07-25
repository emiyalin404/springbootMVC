package net.javaguides.springboot.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import net.javaguides.springboot.entity.User;
import net.javaguides.springboot.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/VueTestApi/api/VueTest")
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/search")
    public ResponseEntity<List<User>> searchUsers(@RequestParam String query) {
        System.out.println("成功");
        return ResponseEntity.ok(userService.searchUsers(query));
    }

    @PostMapping("/adduser")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @PostMapping("/Login")
    @CrossOrigin("http://192.168.92.147:8088")
    public List<Map<String, Object>> UserLogin(@RequestBody User user) {
        String USER_ID = user.getUSER_ID();
        String PassWord = user.getPASSWORD();
        List<User> loginResult = userService.UserLogin(USER_ID, PassWord);

        List<Map<String, Object>> resultList = new ArrayList<>();
        for (User userItem : loginResult) {
            Map<String, Object> resultMap = new HashMap<>();
            resultMap.put("Message", "登录成功");
            resultMap.put("Status", "Y");
            resultMap.put("User", userItem);
            resultList.add(resultMap);
        }

        ObjectMapper mapper = new ObjectMapper();
        try {
            String jsonResult = mapper.writeValueAsString(resultList);
            System.out.println(jsonResult);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return resultList;
    }
    // public List<User> UserLogin(@RequestBody User user) {
    // // String USER_ID = user.getUSER_ID();
    // // String PassWord = user.getPASSWORD();
    // // System.out.println(userService.UserLogin(USER_ID, PassWord));
    // // return userService.UserLogin(USER_ID, PassWord);

    // String USER_ID = user.getUSER_ID();
    // String PassWord = user.getPASSWORD();
    // List<User> loginResult = userService.UserLogin(USER_ID, PassWord);
    // ObjectMapper mapper = new ObjectMapper();
    // try {
    // String jsonResult = mapper.writeValueAsString(loginResult);
    // System.out.println(jsonResult);
    // } catch (Exception e) {
    // e.printStackTrace();
    // }
    // return loginResult;
    // }

}
