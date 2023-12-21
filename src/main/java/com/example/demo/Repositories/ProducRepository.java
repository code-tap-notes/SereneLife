package com.example.demo.Repositories;

import com.example.demo.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProducRepository extends JpaRepository<Product, Long> {

}
