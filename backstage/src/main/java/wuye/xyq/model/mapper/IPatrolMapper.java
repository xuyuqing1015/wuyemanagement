package wuye.xyq.model.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import wuye.xyq.pojo.CoPatrol;

import java.util.List;

@Mapper
@Repository
public interface IPatrolMapper {
    List<CoPatrol> examine();
}
