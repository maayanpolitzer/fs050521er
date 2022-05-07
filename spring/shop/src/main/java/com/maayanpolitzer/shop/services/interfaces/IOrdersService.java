package com.maayanpolitzer.shop.services.interfaces;

import com.maayanpolitzer.shop.models.dto.OrderDTO;

import java.util.List;

public interface IOrdersService {

    List<OrderDTO> getOrdersByUserId(String userId);

    OrderDTO createOrderByUserId(String userId, OrderDTO order);

}
