package com.ash.property_mgmt.controller;

import com.ash.property_mgmt.converter.PropertyConverter;
import com.ash.property_mgmt.dto.propertyDTO;
import com.ash.property_mgmt.entity.PropertyEntity;
import com.ash.property_mgmt.repository.PropertyRepository;
import com.ash.property_mgmt.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class propertyController {

    @Autowired
    private PropertyService propertyService;



    @PostMapping("/properties")
    public ResponseEntity<propertyDTO> saveProperty(@RequestBody propertyDTO propertyDTO)
    {
        propertyDTO=propertyService.saveProperty(propertyDTO);
        ResponseEntity<propertyDTO> responseEntity = new ResponseEntity<>(propertyDTO, HttpStatus.CREATED);
        return responseEntity;
    }

    @GetMapping("/properties")
    public ResponseEntity<List<propertyDTO>> getAllProperties(){
        List<propertyDTO> propertyList = propertyService.getAllProperties();
        ResponseEntity<List<propertyDTO>> responseEntity = new ResponseEntity<>(propertyList,HttpStatus.OK);
        return responseEntity;
    }

    @PutMapping("/properties/{id}")
    public ResponseEntity<propertyDTO> updateProperty(@RequestBody propertyDTO propertyDTO, @PathVariable Long id){
        propertyDTO = propertyService.updateProperty(propertyDTO , id);
        ResponseEntity<propertyDTO> responseEntity = new ResponseEntity<>(propertyDTO, HttpStatus.OK);
        return responseEntity;
    }

    @PatchMapping("/properties/price/{id}")
    public ResponseEntity<propertyDTO> updatePrice(@RequestBody propertyDTO propertyDTO, @PathVariable Long id){
       propertyDTO = propertyService.updatePrice(propertyDTO,id) ;
       ResponseEntity<propertyDTO> responseEntity = new ResponseEntity<>(propertyDTO, HttpStatus.OK);
        return responseEntity;
    }

    @DeleteMapping("/properties/{id}")
    public ResponseEntity deleteProperty(@PathVariable Long id){
         propertyService.deleteProperty(id);
         ResponseEntity<Void> responseEntity = new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
         return responseEntity;
    }



}
