package service;

import po.Order;
import vo.Result;

public interface StaffService  {
    public Result<Order> receiveOrder(Order order);
    public Result<Order> noReceiverOrder(Order order);
    public Result<Order> takeRender(Order order,String username);
    public Result<Order> endOrder(Order order);

}
