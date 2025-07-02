package com.ash.property_mgmt.converter;

import com.ash.property_mgmt.dto.UserDTO;
import com.ash.property_mgmt.entity.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {

    public UserEntity convertDTOtoEntity(UserDTO userDTO){
        UserEntity ue = new UserEntity();
        ue.setName(userDTO.getName());
        ue.setEmail(userDTO.getEmail());
        ue.setPhone(userDTO.getPhone());
        ue.setPassword(userDTO.getPassword());
        return ue;
    }

    public UserDTO convertEntitytoDTO(UserEntity userEntity){
        UserDTO dto = new UserDTO();
        dto.setId(userEntity.getId());
        dto.setName(userEntity.getName());
        dto.setEmail(userEntity.getEmail());
        dto.setPhone(userEntity.getPhone());
                return dto;
    }
}
