package com.ash.property_mgmt.service;

import com.ash.property_mgmt.converter.PropertyConverter;
import com.ash.property_mgmt.dto.propertyDTO;
import com.ash.property_mgmt.entity.PropertyEntity;
import com.ash.property_mgmt.repository.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class PropertyServiceImpl implements PropertyService{


    @Autowired
    private PropertyConverter propertyConverter;
    @Autowired
    private PropertyRepository propertyRepository;
    @Override
    public propertyDTO saveProperty(propertyDTO propertyDTO) {
        PropertyEntity pe= propertyConverter.convertDTOtoEntity(propertyDTO);
        pe = propertyRepository.save(pe);
        propertyDTO = propertyConverter.convertEntitytoDTO(pe);
        return propertyDTO;
    }

    @Override
    public List<propertyDTO> getAllProperties() {
        List<PropertyEntity> listofprop = (List<PropertyEntity>)propertyRepository.findAll();
        List<propertyDTO> dto = new ArrayList<>();
        for(PropertyEntity pe : listofprop){
            propertyDTO propertyDTO = propertyConverter.convertEntitytoDTO(pe);
            dto.add(propertyDTO);
        }

              return dto;
    }

    @Override
    public propertyDTO updateProperty(propertyDTO propertyDTO, Long id) {
        Optional<PropertyEntity> oe = propertyRepository.findById(id);
        propertyDTO dto =null;
        if(oe.isPresent()){
          PropertyEntity pe = oe.get();
            pe.setTitle(propertyDTO.getTitle());
            pe.setDescription(propertyDTO.getDescription());
            pe.setOwnerName(propertyDTO.getOwnerName());
            pe.setOwnerEmail(propertyDTO.getOwnerEmail());
            pe.setPrice(propertyDTO.getPrice());
            pe.setAddress(propertyDTO.getAddress());
            dto = propertyConverter.convertEntitytoDTO(pe);
            propertyRepository.save(pe);
        }
        return dto;
    }

    @Override
    public propertyDTO updatePrice(propertyDTO propertyDTO, Long id) {
        Optional<PropertyEntity> oe = propertyRepository.findById(id);
        propertyDTO dto =null;
        if(oe.isPresent()){
            PropertyEntity pe = oe.get();
            pe.setPrice(propertyDTO.getPrice());
            dto = propertyConverter.convertEntitytoDTO(pe);
            propertyRepository.save(pe);
        }
        return dto;
    }

    @Override
    public void deleteProperty(Long id) {
        propertyRepository.deleteById(id);
    }
}
