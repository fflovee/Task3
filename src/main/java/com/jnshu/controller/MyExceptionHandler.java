package com.jnshu.controller;

import com.jnshu.pojo.Result;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class MyExceptionHandler {

    private static Logger log = LogManager.getLogger(MyExceptionHandler.class);

    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public Result exception(Exception e) {
        log.info("=================全局异常捕获=================");
        log.info(e);
        return new Result(0, "服务器异常");
    }
}
