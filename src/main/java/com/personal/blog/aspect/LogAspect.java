package com.personal.blog.aspect;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * Log 切面
 * @author YUDI
 * @date 2020/9/21 23:27
 */
@Slf4j
@Aspect
@Component
public class LogAspect {

    @Pointcut("execution(* com.personal.blog.controller.*.*(..))")
    public void log(){}

    @Before("log()")
    public void doBefore(JoinPoint jp) {
        HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
        String url = request.getRequestURL().toString();
        String ip = request.getRemoteAddr();
        String classMethod = jp.getSignature().getDeclaringTypeName() + "." + jp.getSignature().getName();
        Object[] args = jp.getArgs();
        for (Object arg : args) {
            System.out.println(arg.toString());
        }
        RequestLog requestLog = new RequestLog(url,ip,classMethod,args);
        log.info("--------------doBefore----------------");
        log.info("Request:{}",requestLog);
    }

    @After("log()")
    public void doAfter(){
        log.info("--------------doAfter----------------");
    }

    @AfterReturning(returning = "result",pointcut = "log()")
    public void doAfterReturn(Object result){
        log.info("Result:{}",result);
    }

    @AllArgsConstructor
    @ToString
    private class RequestLog{
        private String url;
        private String ip;
        private String classMethod;
        private Object[] args;
    }

}
