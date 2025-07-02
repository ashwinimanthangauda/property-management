package com.ash.property_mgmt.service;

import com.ash.property_mgmt.dto.UserDTO;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    UserDTO register(UserDTO userDTO);
    UserDTO login (String email, String password);
}
