package com.example.crmPackage.controller;

import com.example.crmPackage.model.Customer;
import com.example.crmPackage.exception.ResourceNotFoundException;
import com.example.crmPackage.Repository.CRMRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//import javax.validation.Valid;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class CRMController {

  @Autowired
  private CRMRepository crmRepository;
  


  /**
   * Get all books list.
   *
   * @return the list
   */
  @GetMapping("/user")
  public List<Customer> getAllCustomers() {
    return crmRepository.findAll();
  }

}
