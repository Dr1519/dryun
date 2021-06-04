package org.dryun.untils;

import java.io.Serializable;

/**
 * @Description: 自定义响应数据结构
 *              这个类是提供给门户，ios，安卓，微信商城用的
 *              门户接受此类数据后需要使用本类的方法转换成对于的数据类型格式（类，或者list）
 *              其他自行处理
 *              200：表示成功
 *              500：表示错误，错误信息在msg字段中
 *              501：bean验证错误，不管多少个错误都以map形式返回
 *              502：拦截器拦截到用户token出错
 *              555：异常抛出信息
 */
public class Result implements Serializable {

    // 响应业务状态
    private Integer code;

    // 响应消息
    private String msg;

    //响应条数
    private Integer count;

    // 响应中的数据
    private Object data;


    public static Result build(Integer code, String msg, Integer count, Object data) {
        return new Result(code, msg, count, data);
    }

    public static Result build(Integer code, String msg, Object data) {
        return new Result(code, msg, 0, data);
    }

    public static Result build(Integer code, String msg) {
        return new Result(code, msg, 0, null);
    }

    public Result() {
    }

    public Result(Integer code, String msg, Integer count, Object data) {
        this.code = code;
        this.msg = msg;
        this.count = count;
        this.data = data;
    }

    public Result(Object data) {
        this.code = 200;
        this.count = 0;
        this.msg = "OK";
        this.data = data;
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

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", count=" + count +
                ", data=" + data +
                '}';
    }
}
