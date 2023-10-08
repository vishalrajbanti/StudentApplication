package com.geekster.Student.Controller;

import com.geekster.Student.Model.Address;
import com.geekster.Student.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;

// add a address
    @PostMapping("address")
    public String addAddress(@RequestBody Address myaddress){
        return addressService.addAddress(myaddress);
    }

    // get all addresses
    @GetMapping("addresses")
    public List<Address> getAllAddresses(){
        return addressService.getAllAddresses();
    }

   // update address
    @PutMapping
    public String updateAddress(@RequestBody Address address){
        return addressService.updateAddress(address);
    }
    // delete by id
    @DeleteMapping("address/id/{id}")
    public String deleteAddress(@PathVariable Long id){
        return addressService.deleteAddress(id);
    }
}
