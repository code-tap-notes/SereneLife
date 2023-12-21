package com.example.demo.Controllers;

import com.example.demo.Models.Product;
import com.example.demo.Repositories.ProducRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/Products")
public class ProducController {
    //DI Dependence Injection
    @Autowired
    private ProducRepository repository;

@GetMapping("")
//This request is http://localhost:8080/api/v1/Products
List<Product> getAllProducts ()
    {
    /*return List.of(

            new Product(1,"MacBook",2023,2500.0,""),
            new Product(2,"Asus",2022,2100.50,"")
             );*/
        return repository.findAll();

}
}
