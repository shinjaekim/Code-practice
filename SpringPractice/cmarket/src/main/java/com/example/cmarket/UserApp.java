package com.example.cmarket;

import com.example.cmarket.user.User;
import com.example.cmarket.user.UserGrade;
import com.example.cmarket.user.UserService;
import com.example.cmarket.user.UserServiceImpl;

public class UserApp {

    public static void main(String[] args) {
        //UserService userService = new UserServiceImpl(); //수정2

        AppConfig appConfig = new AppConfig();
        UserService userService = appConfig.userService();

        User user = new User(0L, "KIMSHINJAE", UserGrade.GRADE_2);
        userService.signUp(user);

        User currentUser = userService.findUser((0L));
        System.out.println("signup user : " + user.getName());
        System.out.println("current user : " + currentUser.getName());

        if(user.getName().equals(currentUser.getName())) {
            System.out.println("새롭게 가입한 사용자와 현재 사용자가 같습니다.");
        }
    }
}
