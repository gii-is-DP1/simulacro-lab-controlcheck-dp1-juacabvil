package org.springframework.samples.petclinic.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository ProductRepository;
	
    public List<Product> getAllProducts(){
    	List<Product> p = ProductRepository.findAll();
        return p;
    }

    public List<Product> getProductsCheaperThan(double price) {
    	List<Product> p = ProductRepository.findByPriceLessThan(price);
        return p;
    }

    public ProductType getProductType(String typeName) {
    	ProductType p = ProductRepository.getProductType(typeName);
        return p;
    }
    
    public List<ProductType> findAllProductTypes(){
    	List<ProductType> pt = ProductRepository.findAllProductTypes();
    	return pt;
    }

    public void save(Product p){
    	ProductRepository.save(p);       
    }

    
}
