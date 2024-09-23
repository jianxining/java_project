package com.atguigu.mapper;

import com.atguigu.pojo.Order;

public interface OrderMapper {
    Order queryOrderByOrderId(Integer orderId);
}
