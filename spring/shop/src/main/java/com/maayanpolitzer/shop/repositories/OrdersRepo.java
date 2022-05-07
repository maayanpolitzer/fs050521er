package com.maayanpolitzer.shop.repositories;

import com.maayanpolitzer.shop.models.entities.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdersRepo extends CrudRepository<Order, String> {

    List<Order> findAllByUserId(String userId);

}
