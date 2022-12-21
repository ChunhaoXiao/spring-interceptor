package com.example.interceptor.intcept;

import com.example.interceptor.InvalidHeaderFieldException;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class Myinterceptor  implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //return HandlerInterceptor.super.preHandle(request, response, handler);
        if(null == request.getHeader("tk") || !request.getHeader("tk").equals("kerby")) {
            throw  new InvalidHeaderFieldException("tk is not correct");
        }
        return HandlerInterceptor.super.preHandle(request, response, handler);
    }
}
