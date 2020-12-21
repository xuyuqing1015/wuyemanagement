package wuye.xyq.services;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wuye.xyq.model.mapper.INoticeMapper;
import wuye.xyq.pojo.Notice;

import java.util.List;

/**
 * @author: yangqianqian
 * @date: 2020/12/21
 * @description:公告业务类
 */
@Service
public class NoticeServices {

    @Autowired
    INoticeMapper nomapper;

    /*根据录入时间倒序查询所有*/
    public PageInfo<Notice> selectAll(Integer pageno,Integer pageSize){
        PageHelper.startPage(pageno,pageSize);
        List<Notice> list = nomapper.selectAll();
        PageInfo<Notice> page = new PageInfo<>(list);
        return page;
    }
}
