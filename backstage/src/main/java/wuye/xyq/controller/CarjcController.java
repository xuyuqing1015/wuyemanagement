package wuye.xyq.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wuye.xyq.pojo.Carjc;
import wuye.xyq.services.CarjcServices;

/**
 * @program: backstage
 * @description: 车辆进出Controller层
 * @author: Jie Wan
 * @create: 2020-12-21 17:12
 */
@RestController
@RequestMapping("/carjc")
public class CarjcController {
    @Autowired
    CarjcServices cs;

    @RequestMapping("/all")
    public PageInfo<Carjc> selectall(Integer num){
        return cs.selectall(num);
    }
}
