package com.example.quick_shop.service.order;

import com.example.quick_shop.dto.OrderDto;
import com.example.quick_shop.model.Order;

import java.util.List;

public interface IOrderService {
    Order placeOrder(Long userId);
    OrderDto getOrder(Long orderId);
    List<OrderDto> getUserOrders(Long userId);
}
