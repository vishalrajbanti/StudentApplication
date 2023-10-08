package com.geekster.Student.Repo;

import com.geekster.Student.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressRepo extends JpaRepository<Address,Long> {
}
