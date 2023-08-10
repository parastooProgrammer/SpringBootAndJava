package com.example.demo.welcome.controller;

import com.example.demo.welcome.entity.Product;
import com.example.demo.welcome.repository.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/product")
public class ProductController {
    private ProductRepository productRepository;
    private Logger LOG = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @RequestMapping(value = "save", method = RequestMethod.POST)
    public String saveProduct() {
        Product product = new Product();
        product.setCategory("Electronic");
        product.setName("Flash");
        product.setSector("Computer");
        product.setType("DataIn");

        productRepository.save(product);
        LOG.info("product saved " + product.getId());

        StringBuilder ret = new StringBuilder(50);
        ret.append("product is saved");
        ret.append(System.getProperty("line.separator"));
        ret.append("your refrence code is : " + product.getId());

        return ret.toString();
    }

    @RequestMapping(value = "getByCategName", method = RequestMethod.GET)
    public String findProductByCategoryAndType() {
        List<Product> productList = productRepository.findByCategoryAndType("Electronic", "DataIn");
        StringBuilder ret = new StringBuilder(50);
        if(productList!=null && !productList.isEmpty()) {
            for (Product p : productList) {
                ret.append(System.getProperty("line.separator"));
                ret.append(p.getName()+" "+p.getId());
            }
        }
        return ret.toString();
    }
}
