package com.example.appdatarest.Service;

import com.example.appdatarest.Entity.Address;
import com.example.appdatarest.Repository.AddressRepo.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//@Service
public class AddressService {
//
//
//    @Autowired
//    AddressRepo repo;
//
//    public List<Address> getAddresses(int page, int size) {
//        Pageable pageable = PageRequest.of(page, size);
//        Page<Address> page1 = repo.findAll(pageable);
//        return page1.getContent();
//    }
//
//    public Address getAddresses(int id) {
//        Optional<Address> byId = repo.findById(id);
//        return byId.orElse(null);
//    }
//
//    public Address addAdress(Address address) {
//        Address save = repo.save(address);
//        return address;
//    }
//
//    public Address editService(int id,Address address) {
//        Optional<Address> byId = repo.findById(id);
//        if (!byId.isPresent()) {
//            return null;
//        }
//        Address address1=byId.get();
//        address1.setCity(address.getCity());
//        address1.setStreet(address.getStreet());
//        repo.save(address1);
//        return address1;
//    }
//
//    public boolean deleteaddress(int id) {
//        try {
//            repo.deleteById(id);
//            return true;
//        }catch (Exception e){
//            return false;
//        }
//    }
}
