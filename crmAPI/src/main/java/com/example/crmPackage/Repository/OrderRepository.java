package com.example.crmPackage.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.crmPackage.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {}