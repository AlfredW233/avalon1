package com.avalon.VO;

public class ResultVO <T>{
    //返回代码
    private Integer code;
    //返回提示信息
    private String msg;
    //返回具体内容
    private T data;

    public ResultVO(){

    }

    public ResultVO(Integer code, String msg){
        this.code = code;
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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
