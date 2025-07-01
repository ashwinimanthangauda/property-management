package com.ash.property_mgmt.service;

import com.ash.property_mgmt.dto.propertyDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PropertyService {
    propertyDTO saveProperty(propertyDTO propertyDTO);
    List<propertyDTO> getAllProperties();
    propertyDTO updateProperty(propertyDTO propertyDTO, Long id);
    propertyDTO updatePrice(propertyDTO propertyDTO, Long id);
    void deleteProperty(Long id);

}
