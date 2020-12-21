package wuye.xyq.model.jdao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import wuye.xyq.pojo.Owners;

/**
 * @author: gyd
 * @date: 2020/12/21
 * @description: 业主信息的操作
 */
@Repository
public interface IOwnersDao extends CrudRepository<Owners,Integer> {

}
