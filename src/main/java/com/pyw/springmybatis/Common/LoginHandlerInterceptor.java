package com.pyw.springmybatis.Common;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;
import java.io.PrintWriter;

public class LoginHandlerInterceptor implements HandlerInterceptor {
    // 目标方法执行之前
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if(handler instanceof HandlerMethod){
            String method = ((HandlerMethod) handler).getMethod().getName();
            if("doLogin".equals(method)||"error".equals(method)){
                return true;
            }
            //登录判断
            Object user = request.getSession().getAttribute("loginUser");
            if (user == null) {
//            // 未登录，给出错误信息，
                request.setAttribute("msg", "无权限请先登录");
                response.sendRedirect("/login");
                return false;
            }
//            if(user == null){
//                //未登录
//                render(response, CodeMsg.NOT_LOGIN);
//                return false;
//            }
        }
        return true;



//        // 如果获取的request的session中的loginUser参数为空（未登录），就返回登录页，否则放行访问
//        if (user == null) {
//            // 未登录，给出错误信息，
////            request.setAttribute("msg","无权限请先登录");
////            // 获取request返回页面到登录页
////            response.sendRedirect("/login");
////            return false;
//
//           // response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
////            String url = "/industryiot/Login.html";
////            response.sendRedirect(url);
//
//            response.setCharacterEncoding("UTF-8");
//            response.setContentType("application/json; charset=utf-8");
//            JSONObject res = new JSONObject();
//            res.put("status","-1");
//            res.put("msg","need login");
//            PrintWriter out = null ;
//            out = response.getWriter();
//            out.write(res.toString());
//            out.flush();
//            out.close();
//            return false;
//        } else {
//            // 已登录，放行
//            return true;
//        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }

    private void render(HttpServletResponse response, CodeMsg codeMsg)throws Exception {
        response.setContentType("application/json;charset=UTF-8");
        OutputStream out = response.getOutputStream();
        String str  = JSON.toJSONString(codeMsg);
        out.write(str.getBytes("UTF-8"));
        out.flush();
        out.close();
    }
}

