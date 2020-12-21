package wuye.xyq.model.jdao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import wuye.xyq.pojo.Emp;

@Repository
public interface IEmpDao extends CrudRepository<Emp,Integer> {
}
