package org.example.order.exception;

import com.alibaba.csp.sentinel.adapter.spring.webmvc.callback.BlockExceptionHandler;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.csp.sentinel.slots.block.authority.AuthorityException;
import com.alibaba.csp.sentinel.slots.block.degrade.DegradeException;
import com.alibaba.csp.sentinel.slots.block.flow.FlowException;
import com.alibaba.csp.sentinel.slots.block.flow.param.ParamFlowException;
import com.alibaba.csp.sentinel.slots.system.SystemBlockException;
import org.example.common.Result;
import org.example.common.utils.JsonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class MyBlockExceptionHandler implements BlockExceptionHandler {

    private final static Logger logger = LoggerFactory.getLogger(MyBlockExceptionHandler.class);

    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, BlockException e) throws Exception {

        logger.error("BlockExceptionHandler: {}", e.getRule());

        Result<?> result = null;
        if (e instanceof FlowException) {
            result = Result.error(-1, "接口限流了");
        } else if (e instanceof DegradeException) {
            result = Result.error(-2, "服务降级了");
        } else if (e instanceof ParamFlowException) {
            result = Result.error(-3, "参数限流了");
        } else if (e instanceof AuthorityException) {
            result = Result.error(-4, "权限规则不通过");
        } else if (e instanceof SystemBlockException) {
            result = Result.error(-5, "系统保护");
        }

        response.setContentType("application/json;charset=utf-8");
        response.getWriter().write(JsonUtil.objectToJson(result));

    }

}
