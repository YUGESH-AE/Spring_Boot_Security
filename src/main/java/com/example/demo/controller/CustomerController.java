package com.example.demo.controller;

import com.example.demo.CustomerService.CustomerService;
import com.example.demo.entity.Customer;
import com.example.demo.exception.NoSuchCustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    /*
    http://localhost:8082/customer/insert
     */

    @PostMapping(consumes = "application/json",path ="/insert" )
    public ResponseEntity<Customer> insert( @RequestBody Customer customer){
        Customer customerDto1=customerService.insertCustomer(customer);
        return new ResponseEntity<>(customerDto1, HttpStatus.OK);
    }

    /*
    http://localhost:8082/customer/get
     */

    @GetMapping(produces = "application/json",path = "/get")
    public ResponseEntity<List<Customer>> get(){
        List<Customer>customers= customerService.getAllCustomer();
        return new ResponseEntity<>(customers,HttpStatus.OK);
    }

    /*
    http://localhost:8082/customer/delete/786786984
     */

    @DeleteMapping(path = "/delete/{phoneNo}")
    public ResponseEntity<String> delete( @PathVariable("phoneNo") Long phoneNo) throws NoSuchCustomer {
        String response= customerService.deleteCustomer(phoneNo);
        return new ResponseEntity<>(response,HttpStatus.OK);
    }

    /*
    http://localhost:8082/customer/update
     */

    @PutMapping(path = "/update")
    public ResponseEntity<Customer> update( @RequestBody Customer customer) throws NoSuchCustomer {
        Customer customer1=customerService.updateCustomer(customer);
        return new ResponseEntity<>(customer1,HttpStatus.OK);
    }

    /*
    http://localhost:8082/customer/getparticular?name=rajesh&age=21
     */

    @GetMapping(path = "/getparticular")
    public ResponseEntity<Customer> getParticular( @RequestParam("name")String name, @RequestParam("age")Integer age){
       ResponseEntity<Customer> customer=customerService.findbyNameAndAge(name,age);
       return customer;
    }
}
