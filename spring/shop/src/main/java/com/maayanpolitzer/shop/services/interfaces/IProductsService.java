package com.maayanpolitzer.shop.services.interfaces;

import com.maayanpolitzer.shop.models.dto.ProductDTO;

import java.util.List;

public interface IProductsService {

    List<ProductDTO> getAllProducts();

    ProductDTO getProductById(String productId);

    ProductDTO createNewProduct(ProductDTO productDTO);

}
