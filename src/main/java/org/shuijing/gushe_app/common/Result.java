package org.shuijing.gushe_app.common;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: Result
 * @Description: TODO
 * @author: 达观
 * @date: 2022/7/18  16:46
 */

/**
 * 通用返回结果
 */

@Data
public class Result<T> {

    private Integer code = 0;
    private String msg = "";
    private T data ;

    private  Map map = new HashMap(); //动态数据

    public static <T> Result<T> success(T object){
        Result<T> result = new Result<T>();
        result.data = object;
        result.code  = 200;
        return result;
    }

    public static <T> Result<T> error(int code,String msg){
        Result result = new Result();
        result.msg = msg;
        result.code  = code;
        return result;
    }

    public  Result<T> add(String key, Object value) {
        this.code = 200;
        this.map.put(key,value);
        return this;
    }


}
