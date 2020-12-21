package wuye.xyq.services;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wuye.xyq.model.jdao.IOwnersDao;
import wuye.xyq.model.mapper.IOwnersMapper;
import wuye.xyq.pojo.Owners;

import java.util.List;

@Service
public class OwnersServices {
    @Autowired
    IOwnersMapper omapper;
    @Autowired
    IOwnersDao odao;
    //展示首页数据
    public PageInfo<Owners> selectAll(Integer no,Integer size){
        Package.getPackages();
        List<Owners> list = omapper.selectAll();
        PageInfo<Owners> page = new PageInfo<>(list);
        return page;
    }
    //录入业主信息
    public Integer doinsert(Owners o){
        try{
            System.out.println("servicer中接收的业主信息:"+o);
            odao.save(o);
            return 1;
        }catch (Exception e){
            e.printStackTrace();
            return 0;
        }
    }
}
