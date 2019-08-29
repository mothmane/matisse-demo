package com.matisse.demo;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatcher;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;


@RunWith(SpringRunner.class)
@ContextConfiguration(classes={ProductService.class})
public class ProductServiceTest {
    @Autowired
    private ProductService productService;

    @MockBean
    private ProductRepository productRepository;

    @Before
    public void setUp(){

    }
    @Test
    public void test01(){
        Product product= new Product(1,"nomproduit","description");

        Mockito.when(productRepository.findById(ArgumentMatchers.anyLong())).thenReturn(Optional.of(product));

        Assertions.assertThat(product).isEqualTo(productService.findById(1).get());
    }

    @Test
    public void test02(){
        Product product= new Product(1,"nomproduit","description");

        Mockito.when(productRepository.findById(ArgumentMatchers.anyLong())).thenReturn(Optional.of(product));

        Assertions.assertThat(product).isEqualTo(productService.findById(1).get());
    }

    @Test
    public void test03(){
        Product product= new Product(1,"nomproduit","description");

        Mockito.when(productRepository.findById(ArgumentMatchers.anyLong())).thenReturn(Optional.of(product));

        Assertions.assertThat(product).isEqualTo(productService.findById(1).get());
    }
    @Test
    public void test04(){
        Product product= new Product(1,"nomproduit","description");

        Mockito.when(productRepository.findById(ArgumentMatchers.anyLong())).thenReturn(Optional.of(product));

        Assertions.assertThat(product).isEqualTo(productService.findById(1).get());
    }

}
