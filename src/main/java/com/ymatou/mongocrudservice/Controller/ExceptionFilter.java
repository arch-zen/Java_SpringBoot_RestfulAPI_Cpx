package com.ymatou.mongocrudservice.Controller;

import com.ymatou.mongocrudservice.SDK.BaseResponseModel;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by chenpengxuan on 2016/9/5.
 */
@ControllerAdvice
public class ExceptionFilter {
    @ExceptionHandler(RuntimeException.class)
    public @ResponseBody
    BaseResponseModel runtimeExceptionHandler(RuntimeException runtimeException) {

        BaseResponseModel response = new BaseResponseModel();
        response.Msg = runtimeException.getCause().getMessage();
        response.Code = 500;
        return response;
    }
}
