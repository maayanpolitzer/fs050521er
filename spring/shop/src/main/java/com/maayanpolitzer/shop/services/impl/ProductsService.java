package com.maayanpolitzer.shop.services.impl;

import com.maayanpolitzer.shop.models.dto.ProductDTO;
import com.maayanpolitzer.shop.models.entities.Product;
import com.maayanpolitzer.shop.repositories.ProductsRepo;
import com.maayanpolitzer.shop.services.interfaces.IProductsService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

@Service
public class ProductsService implements IProductsService {

    private ProductsRepo productsRepo;

    private ModelMapper modelMapper;

    @Autowired
    public ProductsService(ProductsRepo productsRepo, ModelMapper modelMapper){
        this.productsRepo = productsRepo;
        this.modelMapper = modelMapper;
    }

    public List<ProductDTO> getAllProducts(){
        Iterable<Product> products = productsRepo.findAll();
        Iterator<Product> iterator = products.iterator();
        ArrayList<Product> list = new ArrayList<>();
        while(iterator.hasNext()){
            Product product = iterator.next();
            list.add(product);
        }
        List<ProductDTO> dtoList = modelMapper.map(list, new TypeToken<List<ProductDTO>>(){}.getType());
        return dtoList;
    }

    public ProductDTO getProductById(String productId){
        Product product = productsRepo.findById(productId).orElse(null);
        if(product != null){
            ProductDTO productDTO = modelMapper.map(product, ProductDTO.class);
            return productDTO;
        }else{
            return null;
        }
    }

    public ProductDTO createNewProduct(ProductDTO productDTO) {
        productDTO.setId(UUID.randomUUID().toString());
        Product product = modelMapper.map(productDTO, Product.class);
        productsRepo.save(product);
        productDTO = modelMapper.map(product, ProductDTO.class);
        return productDTO;
    }
}
