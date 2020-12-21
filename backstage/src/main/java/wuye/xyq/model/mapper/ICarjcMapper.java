package wuye.xyq.model.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import wuye.xyq.pojo.Carjc;

import java.util.List;

/**
 * @program: backstage
 * @description: 车辆进出Mapper接口
 * @author: Jie Wan
 * @create: 2020-12-21 17:01
 */
@Mapper
@Repository
public interface ICarjcMapper {
    List<Carjc> selectall();

}
