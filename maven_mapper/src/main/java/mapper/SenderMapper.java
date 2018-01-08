package mapper;

import po.Sender;

import java.util.List;

public interface SenderMapper {
    /**
     * 根据id查询快递员信息
     * @param id  快递员id
     * @return 快递员信息
     */
    public Sender querySenderById(int id);
    public List<Sender> querySenderAll();
    public Sender querySenderByName(String username);
}
