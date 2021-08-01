package com.example.crmPackage.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.crmPackage.model.Customer;

@Repository
public interface CRMRepository extends JpaRepository<Customer, Long> {}

