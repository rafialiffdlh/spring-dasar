package rafialif.spring.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import lombok.Getter;
import rafialif.spring.core.repository.ProductRepository;

@Component
public class ProductService {
  @Getter
  private ProductRepository productRepository;

  @Autowired
  public ProductService(ProductRepository productRepository){
    this.productRepository = productRepository;
  }

  public ProductService(ProductRepository productRepository, String name){
    this.productRepository = productRepository;
  }

}
