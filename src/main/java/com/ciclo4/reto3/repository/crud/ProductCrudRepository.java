package com.ciclo4.reto3.repository.crud;

import com.ciclo4.reto3.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductCrudRepository extends MongoRepository<Product, String>{
    
    
}
