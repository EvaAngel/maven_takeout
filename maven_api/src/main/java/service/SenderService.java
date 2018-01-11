package service;

import po.Order;
import po.Sender;
import vo.Result;

public interface SenderService {
    public Boolean msgPush(Order order, Sender sender);
    public Result<Order> receiveOrder(Order order);
    public Result<Order> deliveredOrder(Order order);
}
