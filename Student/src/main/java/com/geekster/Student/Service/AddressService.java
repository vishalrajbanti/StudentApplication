package com.geekster.Student.Service;

import com.geekster.Student.Model.Address;
import com.geekster.Student.Repo.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    IAddressRepo iAddressRepo;

    public String addAddress(Address myaddress) {
        iAddressRepo.save(myaddress);
        return "address added";
    }

    public List<Address> getAllAddresses() {
        return iAddressRepo.findAll();
    }

    public String deleteAddress(Long id) {
        iAddressRepo.deleteById(id);
        return "address deleted";
    }

    public String updateAddress(Address address) {
        iAddressRepo.save(address);
        return "address updated";
    }
}
