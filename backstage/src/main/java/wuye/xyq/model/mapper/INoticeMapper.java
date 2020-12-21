package wuye.xyq.model.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import wuye.xyq.pojo.Notice;

import java.util.List;

@Mapper
@Repository
public interface INoticeMapper {
    /*根据录入时间倒序查询所有*/
    public List<Notice> selectAll();
}
