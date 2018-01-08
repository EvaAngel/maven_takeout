package mapper;

import po.Staff;

import java.util.List;

public interface StaffMapper {
    /**
     * 插入门店员信息
     * @param staff 门店员类
     */
    public void insertStaff(Staff staff);

    /**
     * 查询所有的门店员信息
     * @return 门店员集合信息
     * */
    public List<Staff> queryStaffAll();
}
