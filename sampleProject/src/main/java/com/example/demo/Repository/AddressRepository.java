package com.example.demo.Repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Address;

public interface AddressRepository extends MongoRepository<Address, Integer>{

}
