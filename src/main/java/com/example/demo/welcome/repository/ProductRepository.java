package com.example.demo.welcome.repository;

import com.example.demo.welcome.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,String> {

    List<Product> findByCategoryAndType(String category,String type);
}
