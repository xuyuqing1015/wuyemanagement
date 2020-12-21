package wuye.xyq.services;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wuye.xyq.model.mapper.IResidenceMapper;
import wuye.xyq.pojo.Tresidence;

import java.util.List;

/**
 * @author: tjj
 * @date: 2020-12-21
 * @description:
 */

@Service
public class ResidenceServices {

    @Autowired
    IResidenceMapper imapper;

    public PageInfo<Tresidence> selectall(Integer num,Integer size){
        PageHelper.startPage(num,size);
        List<Tresidence> selectall = imapper.selectall();
        PageInfo<Tresidence> tresidencePageInfo = new PageInfo<>(selectall);
        return tresidencePageInfo;
    }
}
