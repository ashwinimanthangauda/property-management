package com.ash.property_mgmt.converter;

import com.ash.property_mgmt.dto.propertyDTO;
import com.ash.property_mgmt.entity.PropertyEntity;
import org.springframework.stereotype.Component;

@Component
public class PropertyConverter {

    public PropertyEntity convertDTOtoEntity (propertyDTO propertyDTO) {

        PropertyEntity pe = new PropertyEntity();
        pe.setId(propertyDTO.getId());
        pe.setTitle(propertyDTO.getTitle());
        pe.setDescription(propertyDTO.getDescription());
        pe.setOwnerName(propertyDTO.getOwnerName());
        pe.setOwnerEmail(propertyDTO.getOwnerEmail());
        pe.setPrice(propertyDTO.getPrice());
        pe.setAddress(propertyDTO.getAddress());
        return pe;
    }

    public propertyDTO convertEntitytoDTO(PropertyEntity propertyEntity) {

        propertyDTO pe = new propertyDTO();
        pe.setId(propertyEntity.getId());
        pe.setTitle(propertyEntity.getTitle());
        pe.setDescription(propertyEntity.getDescription());
        pe.setOwnerName(propertyEntity.getOwnerName());
        pe.setOwnerEmail(propertyEntity.getOwnerEmail());
        pe.setPrice(propertyEntity.getPrice());
        pe.setAddress(propertyEntity.getAddress());
        return pe;
    }
}
