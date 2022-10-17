package com.example.appdatarest.Repository.AddressRepo;

import com.example.appdatarest.Entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address, Integer> {
}
