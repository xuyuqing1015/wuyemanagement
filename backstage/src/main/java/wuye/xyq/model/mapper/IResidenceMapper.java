package wuye.xyq.model.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import wuye.xyq.pojo.Tresidence;

import java.util.List;

/**
 * @author: tjj
 * @date: 2020-12-21
 * @description: 住宅功能接口
 */

@Mapper
@Repository
public interface IResidenceMapper {

    @Select("select * from tresidence")
    List<Tresidence> selectall();
}
