// package net.javaguides.springboot.controller;

// import java.util.List;

// import org.springframework.web.bind.annotation.CrossOrigin;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

// import net.javaguides.springboot.entity.User;
// import net.javaguides.springboot.service.LoginService;
// import net.javaguides.springboot.to.LoginTo;

// @RestController
// @RequestMapping("/VueTestApi/api/VueTest")
// public class LoginController {
// private LoginService loginService;

// @PostMapping("/Login")
// @CrossOrigin("http://localhost:8088")
// public LoginTo UserLogin(@RequestBody LoginTo loginTo) {
// System.out.println("這是loginTo" + loginTo);
// List<User> userList = loginTo.getUserlist();
// if (userList == null || userList.isEmpty()) {
// // 处理userlist为空的情况，例如返回错误消息
// LoginTo errorResponse = new LoginTo();
// errorResponse.setMessage("用户列表为空");
// errorResponse.setStatus("N");
// return errorResponse;
// }
// String USER_ID = userList.get(0).getUSER_ID();
// String PassWord = userList.get(0).getPASSWORD();
// System.out.println(loginService.login(USER_ID, PassWord));
// LoginTo response = new LoginTo();
// System.out.println(USER_ID + PassWord + "qqqqqq");
// response.setMessage("登入成功");
// response.setStatus("Y");
// response.setUserlist(userList);
// return response;

// }
// }
