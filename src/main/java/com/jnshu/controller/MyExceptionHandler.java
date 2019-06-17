package com.jnshu.controller;

import com.jnshu.pojo.Result;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class MyExceptionHandler {
//    private static Logger log = LogManager.getLogger(MyExceptionHandler.class);
    private static final Logger LOGGER = LogManager.getLogger(MyExceptionHandler.class);

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    Result exception(MethodArgumentNotValidException e) {
        LOGGER.error("===================================================="+e.getMessage(), e);
        LOGGER.info("====================全局异常捕获====================");
        LOGGER.info("========================================================="+e);
        return new Result(0,e.getBindingResult().getAllErrors().get(0).getDefaultMessage());
    }

    @ExceptionHandler(BusinessException.class)
    @ResponseBody
    Result handleBusinessException(BusinessException e) {
        LOGGER.error(e.getMessage(),e);
        return new Result(-1,e.getMessage());
    }


    @ExceptionHandler(Exception.class)
    @ResponseBody
    Result handleException(Exception e){
        LOGGER.error(e.getMessage(), e);
        return new Result(-1,"---状态异常---");
    }
}
