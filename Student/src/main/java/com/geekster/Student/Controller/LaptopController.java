package com.geekster.Student.Controller;

import com.geekster.Student.Model.Laptop;
import com.geekster.Student.Service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LaptopController {

    @Autowired
    LaptopService laptopService;

    // add laptop
    @PostMapping("laptop")
    public String addLaptop(@RequestBody Laptop mylaptop){
        return laptopService.addLaptop(mylaptop);
    }

    // get all laptops
    @GetMapping("laptops")
    public List<Laptop> getAllLaptops(){
        return  laptopService.getAllLaptops();
    }


    @DeleteMapping("laptop/id/{id}")
    public String deleteLaptop(@PathVariable Long id){
        return laptopService.deleteLaptop(id);
    }
}
