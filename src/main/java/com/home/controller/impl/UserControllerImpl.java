package com.home.controller.impl;

import com.home.controller.UserController;
import com.home.dto.User;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;
@RestController
public class UserControllerImpl implements UserController {
    @Override
    public List<String> userList() {
        return Arrays.asList("Amit ","bajaj");
    }

    @Override
    public String getUser(int id) {
        System.out.println(id);
        return "Path Variable :: "+id ;
    }
}
