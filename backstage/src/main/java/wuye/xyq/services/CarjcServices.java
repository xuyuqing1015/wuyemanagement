package wuye.xyq.services;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wuye.xyq.model.mapper.ICarjcMapper;
import wuye.xyq.pojo.Carjc;

import java.util.List;

/**
 * @program: backstage
 * @description: 车辆进出Services层
 * @author: Jie Wan
 * @create: 2020-12-21 17:10
 */
@Service
public class CarjcServices {
    @Autowired
    ICarjcMapper icm;

    public PageInfo<Carjc>selectall(Integer num){
        PageHelper.startPage(num,5);
        List<Carjc> selectall = icm.selectall();
        PageInfo<Carjc> carjcPageInfo = new PageInfo<>(selectall);
        return carjcPageInfo;
    }
}
