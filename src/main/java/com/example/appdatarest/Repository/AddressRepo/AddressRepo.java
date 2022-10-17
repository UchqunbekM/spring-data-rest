package com.example.appdatarest.Repository.AddressRepo;

import com.example.appdatarest.Entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "address")
public interface AddressRepo extends JpaRepository<Address, Integer> {
}
