package com.example.appdatarest.Repository.AddressRepo;

import com.example.appdatarest.Entity.Address;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(path = "address", collectionResourceRel = "list",excerptProjection = CustomAddress.class)
public interface AddressRepo extends JpaRepository<Address, Integer> {

    @RestResource(path = "byName")
   public Page<Address> findAllByCity(@Param("city") String city, Pageable pageable);
}
