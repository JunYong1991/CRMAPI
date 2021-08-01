package com.example.crmPackage.controller;

import com.example.crmPackage.model.Order;
import com.example.crmPackage.exception.ResourceNotFoundException;
import com.example.crmPackage.Repository.OrderRepository;
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
public class OrderController {

  @Autowired
  private OrderRepository orderRepository;
  

  
  @GetMapping("/order")
  public List<Order> getAllOrder() {
    return orderRepository.findAll();
  }

  
  @GetMapping("/order/{id}")
  public ResponseEntity<Order> getOrderById(@PathVariable(value = "id") Long orderId)
      throws ResourceNotFoundException {
    Order order =
        orderRepository
            .findById(orderId)
            .orElseThrow(() -> new ResourceNotFoundException("Order not found on :: " + orderId));
    return ResponseEntity.ok().body(order);
  }

  
  @PostMapping("/order")
  public Order createOrder(@RequestBody Order order) {
    return orderRepository.save(order);
  }

  @PutMapping("/order/{id}")
  public ResponseEntity<Order> updateOrder(
      @PathVariable(value = "id") Long orderId, @RequestBody Order orderDetails)
      throws ResourceNotFoundException {

    Order order =
        orderRepository
            .findById(orderId)
            .orElseThrow(() -> new ResourceNotFoundException("Order not found on :: " + orderId));
    
    order.setCustomerId(orderDetails.getCustomerId());
    order.setCode(orderDetails.getCode());
    order.setQuantity(orderDetails.getQuantity());
    order.setStatus(orderDetails.getStatus());
	order.setStatusDesc(orderDetails.getStatusDesc());
	order.setRemarks(orderDetails.getRemarks());
    
    final Order updatedOrder = orderRepository.save(order);
    return ResponseEntity.ok(updatedOrder);
  }

}
