package com.dbcrud.repositories;

import com.dbcrud.models.Order;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.util.List;

public interface OrderRepository extends CrudRepository<Order,Long> {
    List<Order> findByDate(LocalDate date);
    //findOrderAndOrderItemsByOrderId(long orderId);
}
