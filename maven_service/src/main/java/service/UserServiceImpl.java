package service;

import mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import po.Order;
import vo.Result;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    OrderMapper orderMapper;

    /**
     *
     * @param order controller层传入的数据参数
     * @return 返回结果
     */
    public Result<Order> pushOrder(Order order)
    {
        Result<Order> result=new Result<Order>();
        //判断订单是否为空
        if(order==null)
        {
            result.setMsg("传入的信息为空，不合适");
            return result;
        }
        orderMapper.insertOrder(order);
        result.setMsg("订单生成成功");
        result.setData(order);
        return result;
    }
}
