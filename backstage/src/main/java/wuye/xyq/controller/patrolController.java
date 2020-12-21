package wuye.xyq.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @Classname patrolController
 * @Description TODO
 * @Date 2020/12/21 21:00
 * @Version V1.0
 */
@RestController
@RequestMapping("/patrol")
public class patrolController {
    @RequestMapping("examine")
    public String SelectPatrol(){
        return "让我看看你肚子里是一碗还是两碗凉粉";
    }
    @RequestMapping("addPatrol")
    public String addPatrol(){
        return "吃着火锅唱着歌，就让麻匪给劫了！";
    }
    @RequestMapping("/modify")
    public String modifyPatrol(){
        return "这怕里有什么？怒啊。";
    }
}
