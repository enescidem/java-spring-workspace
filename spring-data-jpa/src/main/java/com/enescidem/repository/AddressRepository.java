package com.enescidem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.enescidem.entites.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long>{

}
