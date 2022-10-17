package com.example.appdatarest.Repository.AddressRepo;

import com.example.appdatarest.Entity.Address;
import com.sun.source.doctree.IndexTree;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Address.class)
public interface CustomAddress {
    Integer getId();
    String getCity();
    String getStreet();


}
