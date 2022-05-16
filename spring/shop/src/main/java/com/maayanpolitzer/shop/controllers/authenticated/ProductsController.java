package com.maayanpolitzer.shop.controllers.authenticated;

import com.maayanpolitzer.shop.models.dto.ProductDTO;
import com.maayanpolitzer.shop.models.requests.ProductRequest;
import com.maayanpolitzer.shop.models.responses.ProductResponse;
import com.maayanpolitzer.shop.services.interfaces.IProductsService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/admin/products")
public class ProductsController {

    private IProductsService productsService;

    private ModelMapper modelMapper;

    @Autowired
    public ProductsController(IProductsService productsService, ModelMapper modelMapper){
        this.productsService = productsService;
        this.modelMapper = modelMapper;
    }

    @GetMapping
    public ResponseEntity getAllProducts(){

        List<ProductDTO> products = productsService.getAllProducts();
        List<ProductResponse> response = modelMapper.map(products, new TypeToken<List<ProductResponse>>(){}.getType());
        return new ResponseEntity(response, HttpStatus.OK);
    }

    @GetMapping("/{productId}")
    public ResponseEntity getProductById(
            @PathVariable String productId
    ){

        ProductDTO productDTO = productsService.getProductById(productId);
        ProductResponse response = modelMapper.map(productDTO, ProductResponse.class);
        return new ResponseEntity(response, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity createNewProduct(
            @Valid @RequestBody ProductRequest productRequest
    ){

        ProductDTO productDTO = modelMapper.map(productRequest, ProductDTO.class);
        productDTO = productsService.createNewProduct(productDTO);
        ProductResponse response = modelMapper.map(productDTO, ProductResponse.class);
        return new ResponseEntity(response, HttpStatus.CREATED);
    }


}
