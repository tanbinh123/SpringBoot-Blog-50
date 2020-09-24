package com.personal.blog.exception;

import com.personal.blog.entity.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * 全局异常控制器
 * @author YUDI
 * @date 2020/9/21 22:39
 */
@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 系统异常
     * @param e
     * @return
     */
    @ExceptionHandler(Exception.class)
    public Result<Object> handleException(Exception e) {
        log.error(e.getMessage(), e);
        return Result.failure("系统错误，请联系管理员");
    }

    /**
     * 运行时异常处理
     * @param e
     * @return
     */
    @ExceptionHandler(RuntimeException.class)
    public Result<String> unknownException(RuntimeException e){
        log.error("运行时异常：",e);
        return Result.failure("运行时异常：" + e.getMessage());
    }

    /**
     * 业务异常
     * @param request
     * @param e
     * @return
     * @throws Exception
     */
    @ExceptionHandler(BusinessException.class)
    public ModelAndView notFound(HttpServletRequest request, Exception e)  {
        log.error("Request URL:{},Exception:{}",request.getRequestURL(),e);
        ModelAndView mv = new ModelAndView();
        mv.addObject("url",request.getRequestURL());
        mv.addObject("exception",e);
        mv.setViewName("error/error");
        return mv;
    }


}
