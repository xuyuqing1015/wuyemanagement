package wuye.xyq.model.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import wuye.xyq.pojo.Owners;

import java.util.List;

@Mapper
@Repository
public interface IOwnersMapper {
    //查看业主信息，用于业主信息展示
    List<Owners> selectAll();
}
