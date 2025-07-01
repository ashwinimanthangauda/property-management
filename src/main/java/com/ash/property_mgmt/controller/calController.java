package com.ash.property_mgmt.controller;

import com.ash.property_mgmt.dto.calDTO;
import com.ash.property_mgmt.dto.propertyDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/cal")
public class calController {

    @GetMapping("/add")
    public Double add(@RequestParam("a") Double a, @RequestParam("b") Double b)
    {
        return a+b;
    }

    @GetMapping("/sub/{a}/{b}")
    public Double sub(@PathVariable("a") Double a, @PathVariable("b") Double b)
    {
        Double res=null;
        if(a>b)
          return   res=a-b;
        else
          return   res=b-a;
    }

    @PostMapping("/mul")
    public Double mul(@RequestBody calDTO calDTO)
    {
        return calDTO.getA()* calDTO.getB()*calDTO.getC();
    }


}
