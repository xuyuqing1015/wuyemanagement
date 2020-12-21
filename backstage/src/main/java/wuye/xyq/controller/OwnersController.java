package wuye.xyq.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import wuye.xyq.pojo.Owners;
import wuye.xyq.services.OwnersServices;

/**
 * @author: gyd
 * @date: 2020/12/21
 * @description: 业主信息
 */
@CrossOrigin
@RestController
@RequestMapping("/owners")
public class OwnersController {
    @Autowired
    OwnersServices os;
    //业主信息展示
    @RequestMapping("/pager")
    public PageInfo<Owners> pager(Integer no, @RequestParam(required = false) Integer size){
        Integer pageSize = 5;
        if(size!=null){
            pageSize = size;
        }
        return os.selectAll(no,pageSize);
    }
    //录入业主信息
    @RequestMapping("/add")
    public Integer add(@RequestBody Owners o){
        System.out.println("controller中接收的业主信息:"+o);
        return os.doinsert(o);
    }
}
