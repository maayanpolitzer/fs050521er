package com.maayanpolitzer.shop.controllers.authenticated;

import com.maayanpolitzer.shop.models.dto.OrderDTO;
import com.maayanpolitzer.shop.models.requests.OrderRequest;
import com.maayanpolitzer.shop.models.responses.OrderResponse;
import com.maayanpolitzer.shop.services.interfaces.IOrdersService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/users/{userId}/orders")
public class OrdersController {

    private ModelMapper modelMapper;
    private IOrdersService ordersService;

    @Autowired
    public OrdersController(ModelMapper modelMapper, IOrdersService ordersService) {
        this.modelMapper = modelMapper;
        this.ordersService = ordersService;
    }

    @GetMapping
    public ResponseEntity getAllOrders(
            @PathVariable String userId
    ){
        List<OrderDTO> orders = ordersService.getOrdersByUserId(userId);
        List<OrderResponse> response = modelMapper.map(orders, new TypeToken<List<OrderResponse>>(){}.getType());
        return new ResponseEntity(response, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity createNewOrder(
            @PathVariable String userId,
            @Valid @RequestBody OrderRequest request
    ){
        OrderDTO orderDTO = modelMapper.map(request, OrderDTO.class);
        OrderDTO newOrder = ordersService.createOrderByUserId(userId, orderDTO);
        return new ResponseEntity(newOrder, HttpStatus.CREATED);
    }

    @PutMapping("/{orderId}")
    public ResponseEntity updateOrder(
            @PathVariable String userId,
            @PathVariable String orderId,
            @Valid @RequestBody OrderRequest request
    ){
        return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
    }


}
