package wuye.xyq.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @Classname FireController
 * @Description TODO
 * @Date 2020/12/21 19:54
 * @Version V1.0
 */
@RestController
@RequestMapping("/fire")
public class FireController {
    @RequestMapping("/examine")
    public String  SelectFire(){
        return "来打我啊~,笨蛋！";
    }
    @RequestMapping("addFire")
    public String addFire(){
        return "你们都听见了，是他叫我打的！";
    }
    @RequestMapping("/modify")
    public String modifyFire(){
        return "吼，我这辈子没有听过这么奇怪的要求。";
    }
}
