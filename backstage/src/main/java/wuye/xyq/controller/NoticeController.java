package wuye.xyq.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import wuye.xyq.config.ResultVo;
import wuye.xyq.pojo.Notice;
import wuye.xyq.services.NoticeServices;

/**
 * @author: yangqianqian
 * @date: 2020/12/21
 * @description:公告控制器类
 */
@CrossOrigin
@RestController
@RequestMapping("/notice1221")
public class NoticeController {

    @Autowired
    NoticeServices ns;

    @RequestMapping("/selectall")
    public ResultVo selectAll(@RequestParam("pageno") Integer pageno,
                              @RequestParam(value = "pageSize",required = false) Integer pageSize){
        Integer size =4;
        if(pageSize!=null){
            pageSize=size;
        }
        PageInfo<Notice> page = ns.selectAll(pageno, pageSize);
        return ResultVo.okAndVO(page);

    }
}
