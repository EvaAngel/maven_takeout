import Vo.Result;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import po.Order;
import service.StaffServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:spring/applicationContext-*.xml")
public class StaffServiceTest {
    //auto是一个赋值的过程，所以不需要扫描，扫描是在类上添加注解才能被扫描到并生成类的对象。
    @Autowired
    StaffServiceImpl staffServiceImpl;
    @Test
    public void endOrderTest()
    {
        Order order=new Order();
        order.setOrder_id(1);
       Result<Order> result=staffServiceImpl.endOrder(order);
       System.out.println(result.getData().getMemo());
    }

}
