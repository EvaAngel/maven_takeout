package service;

import mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import po.Order;
import po.Sender;
import util.WebSocketUtil;
import vo.Result;

//快递员业务逻辑实现层
@Service
public class SenderServiceImpl implements SenderService{

     @Autowired
    OrderMapper orderMapper;
    /**
     *  webSocket实现消息推送功能
     * @param order 需要推送的订单
     * @param sender 推送到配送员
     * @return 返回配送消息信息
     */
     public Boolean msgPush(Order order, Sender sender)
     {
         //这里应该是获得门店的地址信息，但因为还未定义门店地点，所有以门店对象代替
         String message="您有新的订单，请立即前往门店地点，门店地点在"+order.getStore();
         WebSocketUtil.sendMessageToSender(sender,message);
          return true;
     }
    /**
     *  完成快递员的接受工作
     * @param order 指定订单
     * @return 返回结果
     */
    public Result<Order> receiveOrder(Order order)
    {
        Result<Order> result=new Result<Order>();
        // 判断订单是否为空
        if(order==null)
        {
            result.setMsg("订单不存在，请重新输入");
            return result;
        }
        //订单不为空，接受订单后status变为30
        orderMapper.updateOrderStatus("30",order);
        Order order1=orderMapper.queryOrderById(order);
        result.setMsg("订单处理完成，启动下一步");
        result.setData(order1);
        return result;
    }
    public Result<Order> deliveredOrder(Order order)
    {
        Result<Order> result=new Result<Order>();
       orderMapper.updateOrderStatus("40",order);
       Order order1=orderMapper.queryOrderById(order);
       result.setMsg("外卖配送完成");
       result.setData(order1);
       return result;
    }
}
