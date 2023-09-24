package com.food.ordering.system.order.service.domain.valueobject;

import com.food.ordering.system.domain.valueobject.BaseId;
import com.food.ordering.system.order.service.domain.entity.Order;

public class OrderItemId extends BaseId<Long> {

    public OrderItemId(Long value){
        super(value);
    }
}
