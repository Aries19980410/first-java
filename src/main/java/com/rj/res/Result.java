package com.rj.res;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Result {

    private Integer code;//状态码
    private Boolean isSuccess;//状态
    private String message;//消息
    private Object result;//数据对象

    public Result(Boolean success, Integer code, String message){
        super();
        this.isSuccess=success;
        this.code=code;
        this.message=message;
    }

    /**
     * 只返回状态，状态码，数据对象
     * @param statu
     * @param code
     * @param object
     */
    public Result(Boolean success, Integer code, Object result){
        super();
        this.isSuccess=success;
        this.code=code;
        this.result=result;
    }

    /**
     * 返回全部信息即状态，状态码，消息，数据对象
     * @param statu
     * @param code
     * @param message
     * @param result
     */
    public Result(Boolean success, Integer code, String message, Object result){
        super();
        this.isSuccess=success;
        this.code=code;
        this.message=message;
        this.result=result;
    }

}
