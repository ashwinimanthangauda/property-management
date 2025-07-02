package com.ash.property_mgmt.controller;

import com.ash.property_mgmt.dto.UserDTO;
import com.ash.property_mgmt.service.UserService;
import com.ash.property_mgmt.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<UserDTO> register(@RequestBody UserDTO userDTO){
        userDTO=userService.register(userDTO);
        ResponseEntity<UserDTO> responseEntity = new ResponseEntity<>(userDTO, HttpStatus.CREATED);
        return responseEntity;


    }
}
