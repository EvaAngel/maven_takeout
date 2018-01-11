package service;

import po.Order;
import vo.Result;

public interface UserService {
    public Result<Order> pushOrder(Order order);
}
