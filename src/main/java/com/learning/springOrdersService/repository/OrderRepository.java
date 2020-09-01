package com.learning.springOrdersService.repository;

import com.learning.springOrdersService.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Integer> {
}
