package com.geekster.Student.Service;

import com.geekster.Student.Model.Laptop;
import com.geekster.Student.Repo.ILaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopService {
    @Autowired
    ILaptopRepo iLaptopRepo;

    public String addLaptop(Laptop mylaptop) {
        iLaptopRepo.save(mylaptop);
        return "laptop addae";
    }

    public List<Laptop> getAllLaptops() {
        return iLaptopRepo.findAll();
    }

    public String deleteLaptop(Long id) {
        iLaptopRepo.deleteById(id);
        return "laptop removed";
    }
}
