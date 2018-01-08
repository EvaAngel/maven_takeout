package service;

import Vo.Result;
import com.sun.org.apache.regexp.internal.RE;
import mapper.OrderMapper;
import mapper.SenderMapper;
import mapper.StaffMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import po.Order;
import po.Sender;

import java.util.List;
@Service
public class StaffServiceImpl {
    @Autowired
    StaffMapper staffMapper;
    @Autowired
    OrderMapper orderMapper;

    @Autowired
    SenderMapper senderMapper;
    /**
     * 门店员接受订单
     *
     * @param order
     * @return
     */
    public Result<Order> receiveOrder(Order order) {
        Result<Order> result = new Result<Order>();
        //判断订单是否为空
        if (order == null) {
            result.setMsg("订单为空，请重新查询订单后重新提交订单");
            result.setData(order);
            return result;
        }
        //门店员接收订单,即修改订单状态
         orderMapper.updateOrderStatus("10",order);
        Order order1=orderMapper.queryOrderById(order);
        //返回结果信息
        result.setMsg("订单已经接受完毕，正在准备订单");
        result.setData(order1);
        return result;
    }

    /**
     * 门店员取消订单
     */
    public Result<Order> noReceiverOrder(Order order) {
        Result<Order> result = new Result<Order>();
        if (order == null) {
            result.setMsg("订单为空，请重新查询订单后重新提交订单");
            result.setData(order);
            return result;
        }
        orderMapper.updateOrderStatus("-1",order);
        Order order1=orderMapper.queryOrderById(order);
        result.setMsg("取消订单成功");
        result.setData(order1);
        return result;
    }
    public Result<Order> takeRender(Order order,String username)
    {
        Result<Order> result=new Result<Order>();
        // 查询所有配送员信息
        List<Sender> list=senderMapper.querySenderAll();
        // 判断订单状态
        // 根据name获取render信息
        Sender sender=senderMapper.querySenderByName(username);
        // 将render set进入order的sender属性中
        order.setSender(sender);
        // 封装result并返回
        result.setMsg("配送员分配完成");
        result.setData(order);
         return result;
    }
    public Result<Order> endOrder(Order order)
    {
        Result<Order> result=new Result<Order>();
        //设置订单状态为20，表示配送员已接单
        orderMapper.updateOrderStatus("20",order);
        Order order1=orderMapper.queryOrderById(order);
        result.setMsg("配送员已接单，更改订单状态");
        result.setData(order1);
        return result;
    }
}
