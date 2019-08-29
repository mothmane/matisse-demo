package com.matisse.demo;

import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("v1/api/products")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public Product save(Product product) {
        return productService.save(product);
    }

    @GetMapping("/{id}")
    public Optional<Product> findById(Long id) {
        return productService.findById(id);
    }

    @GetMapping
    public Iterable<Product> findAll() {
        return productService.findAll();
    }

    @GetMapping("/count")
    public long count() {
        return productService.count();
    }

    @DeleteMapping("/{id}")
    public void deleteById(Long id) {
        productService.deleteById(id);
    }


    @DeleteMapping
    public void deleteAll() {
        productService.deleteAll();
    }
}
