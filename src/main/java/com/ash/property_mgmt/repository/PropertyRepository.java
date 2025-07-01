package com.ash.property_mgmt.repository;

import com.ash.property_mgmt.entity.PropertyEntity;
import org.springframework.data.repository.CrudRepository;

public interface PropertyRepository extends CrudRepository<PropertyEntity,Long>{

}
