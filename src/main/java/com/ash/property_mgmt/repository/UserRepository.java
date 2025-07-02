package com.ash.property_mgmt.repository;


import com.ash.property_mgmt.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity,Long>{

}
