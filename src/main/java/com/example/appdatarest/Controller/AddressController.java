package com.example.appdatarest.Controller;


import com.example.appdatarest.Entity.Address;
import com.example.appdatarest.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//
//@RestController
//@RequestMapping("/address")
public class AddressController {

//    @Autowired
//    AddressService addressService;
//
//    @GetMapping
//    public ResponseEntity<List<Address>> getAllAddresses(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size) {
//        List<Address> address = addressService.getAddresses(page, size);
//        return ResponseEntity.ok(address);
//    }
//
//    @GetMapping("/{id}")
//    public HttpEntity<?> getAddress(@PathVariable int id) {
//        Address addresses = addressService.getAddresses(id);
//        return ResponseEntity.status(addresses != null ? 200 : 409).body(addresses);
//    }
//
//    @PostMapping
//    public HttpEntity<?> addAddress(@RequestBody Address address) {
//        Address address1 = addressService.addAdress(address);
//        return ResponseEntity.status(201).body(address1);
//    }
//
//    @PutMapping("/{id}")
//    public HttpEntity<?> editAddress(@PathVariable int id, @RequestBody Address address) {
//        Address address1 = addressService.editService(id,address);
//        return ResponseEntity.status(address1 != null ? 202 : 409).body(address1);
//    }
//
//    @DeleteMapping("/{id}")
//    public HttpEntity<?> deleteAddres(@PathVariable int id) {
//        boolean deleteaddress = addressService.deleteaddress(id);
//        return ResponseEntity.ok(202);
//    }


}
