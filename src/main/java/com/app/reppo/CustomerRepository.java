package com.app.reppo;

import com.app.CustomerModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


public interface CustomerRepository extends JpaRepository<CustomerModel, Long > {
    @Query(" from com.app.CustomerModel where email= :email")
    CustomerModel findByEmail(String email);
}
