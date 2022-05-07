package com.maayanpolitzer.shop.services.impl;

import com.maayanpolitzer.shop.models.dto.OrderDTO;
import com.maayanpolitzer.shop.models.entities.Order;
import com.maayanpolitzer.shop.models.responses.ProductResponse;
import com.maayanpolitzer.shop.repositories.OrdersRepo;
import com.maayanpolitzer.shop.services.interfaces.IOrdersService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class OrdersService implements IOrdersService {

    private OrdersRepo ordersRepo;
    private ModelMapper modelMapper;

    @Autowired
    public OrdersService(OrdersRepo ordersRepo, ModelMapper modelMapper) {
        this.ordersRepo = ordersRepo;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<OrderDTO> getOrdersByUserId(String userId) {
        List<Order> orders = ordersRepo.findAllByUserId(userId);
        List<OrderDTO> userOrders = modelMapper.map(orders, new TypeToken<List<OrderDTO>>(){}.getType());
        return userOrders;
    }

    @Override
    public OrderDTO createOrderByUserId(String userId, OrderDTO orderDTO) {
        Order order = modelMapper.map(orderDTO, Order.class);
        order.setId(UUID.randomUUID().toString());
        order.setOrderSubmitted(true);
        order.setUserId(userId);
        ordersRepo.save(order);
        // TODO: 01/05/2022 send email to the seller.
        OrderDTO updatedOrder = modelMapper.map(order, OrderDTO.class);
        return updatedOrder;
    }
}
