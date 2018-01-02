import mapper.StaffMapper;
import mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import po.Staff;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-*.xml")
public class MapperTest {
    @Autowired
    UserMapper userMapper;
    @Autowired
    StaffMapper staffMapper;

    @Test
    public void userTest() {
        System.out.println(userMapper.getUser().size());
    }

    @Test
    public void StaffTest() {
        Staff staff = new Staff();
        staff.setStaff_id(1);
        staff.setUsername("fuxin");
        staffMapper.insertStaff(staff);
    }
}
