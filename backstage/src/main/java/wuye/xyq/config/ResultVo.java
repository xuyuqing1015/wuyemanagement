package wuye.xyq.config;

import com.github.pagehelper.PageInfo;

import java.io.Serializable;
import java.util.List;

/**统一响应格式
 *1、所有的响应结果都在一个对象中（集合和单个实体对象）
 * 2、如果发生错误，会有一个错误码和错误信息（增删改）
 *
 */
public class ResultVo implements Serializable {
    //响应码，1代表正常，0表示错误
    private Integer code;
    //响应的文字消息，一般用于错误是的文字提醒
    private String msg;
    //响应到前台的集合数据
    private List<?> data;
    //响应到前台的对象数据（单条）
    private Object vo;
    /**
     * 成功。没有携带响应数据，仅仅只是告诉前端，数据成功了（一般用于更新、删除等操作）
     */
    public static ResultVo ok = new ResultVo();

    public  static  ResultVo okAndpage(PageInfo<?> list){
        return new ResultVo(list);
    }

    /**
     * 成功。携带了响应消息内容，明确的告诉前端数据成功的信息
     */
    public static ResultVo ok(String msg){
        return new ResultVo(1,msg);
    }

    /**失败。携带了失败的提示信息
     * @param message
     * @return
     */
    public static ResultVo error(String message) {
        return new ResultVo(message);
    }

    /** 成功并携带集合数据
     * @param list
     * @return
     */
    public static ResultVo okAndList(List<?> list) {
        return new ResultVo(list);
    }

    /** 成功并携带单个对象数据
     * @param obj
     * @return
     */
    public static ResultVo okAndVO(Object obj) {
        return new ResultVo(obj);
    }

    public ResultVo(List<?> list) {
        this.code=1;
        setData(list);
    }

    public ResultVo(Object obj) {
        this.code=1;
        setVO(obj);
    }

    public void setVO(Object obj) {
        this.vo = obj;
    }

    public Object getVo() {
        return vo;
    }


    /**
     * 无参构造方法。默认code=1
     */
    private ResultVo() {
        this.code=1;
        this.msg="恭喜，执行成功";
    }

    /**带字符串参数的构造方法，code=-1
     * @param msg
     */
    private ResultVo(Integer code,String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**带字符串参数的构造方法，code=-1
     * @param msg
     */
    private ResultVo(String msg) {
        this.code = -1;
        this.msg = msg;
    }
    public Integer getCode() {
        return code;
    }
    public void setCode(Integer code) {
        this.code = code;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public List<?> getData() {
        return data;
    }
    public void setData(List<?> data) {
        this.data = data;
    }


}
