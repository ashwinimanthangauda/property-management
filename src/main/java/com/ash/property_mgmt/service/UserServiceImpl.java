package com.ash.property_mgmt.service;

import com.ash.property_mgmt.converter.UserConverter;
import com.ash.property_mgmt.dto.UserDTO;
import com.ash.property_mgmt.entity.UserEntity;
import com.ash.property_mgmt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserConverter userConverter;

    @Override
    public UserDTO register(UserDTO userDTO) {
        UserEntity userEntity=userConverter.convertDTOtoEntity(userDTO);
        userEntity=userRepository.save(userEntity);
        userDTO = userConverter.convertEntitytoDTO(userEntity);
        return userDTO;
    }

    @Override
    public UserDTO login(String email, String password) {
        return null;
    }
}
