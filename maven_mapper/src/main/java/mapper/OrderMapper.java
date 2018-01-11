package mapper;

import org.apache.ibatis.annotations.Param;
import po.Order;

public interface OrderMapper {
    public void updateOrderStatus(@Param("status") String status,@Param("order") Order order);
    public Order queryOrderById(@Param("order") Order order);
    public void insertOrder(@Param("order") Order order);
}
