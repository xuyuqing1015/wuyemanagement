package wuye.xyq.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import wuye.xyq.pojo.Tresidence;
import wuye.xyq.services.ResidenceServices;

import javax.xml.ws.Action;

/**
 * @author: tjj
 * @date: 2020-12-21
 * @description:
 */

@RestController
@RequestMapping("/re")
public class ResidenceController {

    @Autowired
    ResidenceServices rservices;

    @GetMapping("/reall")
    public PageInfo<Tresidence> selectall(@RequestParam(required = false) Integer num,
                                          @RequestParam(required = false) Integer size) {
        num = num == null ? 1 : num;
        size = size == null ? 5 : size;
        return rservices.selectall(num, size);
    }
}
